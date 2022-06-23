package ru.javarush.island.field;

import ru.javarush.island.settings.Settings;
import ru.javarush.island.units.abstraction.Animal;
import ru.javarush.island.units.abstraction.Units;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class UnitAction {

    public void move(Animal animal, Location location){

        int distance = ThreadLocalRandom.current().nextInt(0, animal.travelDistance+1);
        if (distance == 0){
            return;
        }

        int direction = ThreadLocalRandom.current().nextInt(0,4);
        int x = location.getxCoordinate();
        int y = location.getyCoordinate();

        switch (direction){
            case 0 -> y+=distance;
            case 1 -> x+=distance;
            case 2 -> y-=distance;
            case 3 -> x-=distance;
        }

        if (GameField.getGameField().isLocationInField(x,y)){
            location.getUnits().remove(animal);
            animal.positionX = x;
            animal.positionY = y;
            GameField.getGameField().getLocation(x,y).addUnitInLocation(animal);
            animal.isMoved = true;
        }

    }


    public void eat(Animal animal, Location location){
        if (animal.isDead)
            return;

        List<Units> units = Settings.unitsList;
        int index = 0;

        for (int i = 0; i < units.size(); i++) {
            if(units.get(i).getClass().isInstance(animal)){
                index = i;
                break;
            }
        }

        Map<String,Integer> eatForAnimal = new HashMap<>();
        int[] eatChance = Settings.chanceToEat[index];

        for (int i = 0; i < eatChance.length; i++) {
            if (eatChance[i] > 0)
                eatForAnimal.put(units.get(i).getClass().getSimpleName(),eatChance[i]);
        }

        List<Units> availableEat = location.getUnits().stream()
                .filter(locationAnimal -> eatForAnimal.containsKey(locationAnimal.getClass().getSimpleName()))
                .collect(Collectors.toCollection(ArrayList::new));

        if (availableEat.isEmpty()){
            weakening(animal,location);
        }

        int indexOfAvailableEat = ThreadLocalRandom.current().nextInt(availableEat.size());
        int successfulEat = ThreadLocalRandom.current().nextInt(100);

        if (successfulEat <= eatForAnimal.get(availableEat.get(indexOfAvailableEat).getClass().getSimpleName())){
            Units prey = availableEat.get(indexOfAvailableEat);
            animal.saturation = Math.min(animal.saturation + prey.weight, animal.stomachVolume);
            death(prey,location);
        }
    }

    public void reproduce(Animal animal, Location location){

        if (!animal.isDead && !animal.isMultiplied){
            List<Animal> partners = location.getUnits().stream()
                    .filter(kindAnimal -> kindAnimal.getClass().getSimpleName().equals(animal.getClass().getSimpleName())
                    && kindAnimal != animal)
                    .map(o->(Animal) o)
                    .filter(o -> !o.isMultiplied && !o.isDead)
                    .collect(Collectors.toCollection(ArrayList::new));

            if (!partners.isEmpty() && !location.isMaxCountOfUnit(animal)) {
                int randomPartner = ThreadLocalRandom.current().nextInt(partners.size());
                partners.get(randomPartner).isMultiplied = true;
                animal.isMultiplied = true;
                animal.createNewOne(location.getxCoordinate(), location.getyCoordinate());
            }
        }
    }

    public void weakening(Animal animal, Location location){
        animal.saturation -= animal.stomachVolume/3.0;
        if (animal.saturation < 0)
            death(animal,location);
    }

    public void death(Units units, Location location){
        location.getUnits().remove(units);
        units.isDead = true;
    }


    /*public List<? extends Units> generateUnits(int xCoordinate, int yCoordinate){
        List<Units> result = new ArrayList<>();
        Constructor constructor = null;

        for (Class clazz: Settings.unitsClass){
            int maxCount = 0;
            try {
                Field field = clazz.getClass().getDeclaredField("MAX_COUNT_ON_LOCATION");
                field.setAccessible(true);
                maxCount = (int) field.get(clazz);
                field.setAccessible(false);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
            int random = ThreadLocalRandom.current().nextInt(0,maxCount+1);

            try {
                constructor = clazz.getConstructor(int.class, int.class);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < random; i++) {
                try {
                    result.add((Units) constructor.newInstance(xCoordinate,yCoordinate));
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }
    }*/
}
