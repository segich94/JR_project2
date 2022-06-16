package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Duck extends Herbivore {

    private static int TRAVEL_DISTANCE = 4;
    private static double STOMACH_VOLUME = 0.15;
    private static double WEIGHT = 1.0;

    public Duck(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
