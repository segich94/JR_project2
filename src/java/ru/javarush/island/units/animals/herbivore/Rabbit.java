package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Rabbit extends Herbivore {

    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 0.45;
    private static double WEIGHT = 2.0;

    public Rabbit(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
