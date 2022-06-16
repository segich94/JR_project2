package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Goat extends Herbivore {

    private static int TRAVEL_DISTANCE = 3;
    private static double STOMACH_VOLUME = 10.0;
    private static double WEIGHT = 60.0;

    public Goat(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
