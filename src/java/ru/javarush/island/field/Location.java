package ru.javarush.island.field;


import ru.javarush.island.settings.Settings;
import ru.javarush.island.units.abstraction.Units;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private int xCoordinate;
    private int yCoordinate;
    private List<Units> units;

    public Location(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        units = new ArrayList<>();
    }

    public List<Units> initLocation(){
        return null;
    }
}
