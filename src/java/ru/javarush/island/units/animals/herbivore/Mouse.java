package ru.javarush.island.units.animals.herbivore;

import ru.javarush.island.units.abstraction.Herbivore;

public class Mouse extends Herbivore {

    private static int TRAVEL_DISTANCE = 1;
    private static double STOMACH_VOLUME = 0.01;
    private static double WEIGHT = 0.05;

    public Mouse(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
