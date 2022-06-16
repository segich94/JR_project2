package ru.javarush.island.units.animals.predator;

import ru.javarush.island.units.abstraction.Predator;

public class Boa extends Predator {
    private static int TRAVEL_DISTANCE = 1;
    private static double STOMACH_VOLUME = 3.0;
    private static double WEIGHT = 15.0;

    public Boa(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
