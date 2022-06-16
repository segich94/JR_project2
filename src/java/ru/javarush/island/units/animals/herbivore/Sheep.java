package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Sheep extends Herbivore {

    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 15.0;
    private static double WEIGHT = 70.0;

    public Sheep(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
