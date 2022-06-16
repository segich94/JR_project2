package ru.javarush.island.units.animals.predator;

import ru.javarush.island.units.abstraction.Predator;

public class Fox extends Predator {

    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 2.0;
    private static double WEIGHT = 8.0;

    public Fox(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
