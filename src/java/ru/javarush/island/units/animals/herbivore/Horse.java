package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Horse extends Herbivore {

    private static int TRAVEL_DISTANCE = 4;
    private static double STOMACH_VOLUME = 60.0;
    private static double WEIGHT = 400.0;

    public Horse(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
