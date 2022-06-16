package ru.javarush.island.units.animals.predator;

import ru.javarush.island.units.abstraction.Predator;

public class Bear extends Predator {

    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 80.0;
    private static double WEIGHT = 500.0;


    public Bear(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
