package ru.javarush.island.field;


import ru.javarush.island.settings.Settings;
import ru.javarush.island.units.abstraction.Units;
import ru.javarush.island.units.plants.Grass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Location {
    private int xCoordinate;
    private int yCoordinate;
    private List<Units> units;
    public boolean phaseEnd = false;

    public Location(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        units = new ArrayList<>();
    }

    public void initLocation(){
        generateGrass();
        generateUnit();
    }

    public void addUnitInLocation(Units unit){
        this.units.add(unit);
    }

    public List<Units> getUnits() {
        return units;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void generateUnit(){
        for (Units unit:Settings.unitsList){
            int maxCount = unit.maxCountOnLocation;
            int random = ThreadLocalRandom.current().nextInt(0,maxCount + 1);

            for (int i = 0; i < random; i++) {
                unit.createNewOne(xCoordinate, yCoordinate);
            }
        }
    }

    public void generateGrass(){
        int maxCount = new Grass(xCoordinate,yCoordinate).maxCountOnLocation;
        int random = ThreadLocalRandom.current().nextInt(0,maxCount);

        if (!this.getUnits().isEmpty()){
            int currentCount = (int) getUnits().stream()
                    .filter(o -> o.getClass().getSimpleName().equals(Grass.class.getSimpleName()))
                    .count();
            random = currentCount + random > maxCount ? maxCount - currentCount : random;
        }

            for (int i = 0; i < random; i++) {
                new Grass(xCoordinate,yCoordinate);
        }
    }

    public boolean isMaxCountOfUnit(Units unit){
         int count = (int) units.stream()
                .filter(o -> o.getClass().isInstance(unit))
                .count();

        return unit.maxCountOnLocation-count == 0;
    }

}
