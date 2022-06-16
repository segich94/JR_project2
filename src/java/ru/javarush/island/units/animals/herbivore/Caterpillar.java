package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Caterpillar extends Herbivore {
    private static int TRAVEL_DISTANCE = 0;
    private static double STOMACH_VOLUME = 0.0;
    private static double WEIGHT = 0.01;

    public Caterpillar(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
