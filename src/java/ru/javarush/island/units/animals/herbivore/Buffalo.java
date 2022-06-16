package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Buffalo extends Herbivore {
    private static int TRAVEL_DISTANCE = 3;
    private static double STOMACH_VOLUME = 100.0;
    private static double WEIGHT = 700.0;

    public Buffalo(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
