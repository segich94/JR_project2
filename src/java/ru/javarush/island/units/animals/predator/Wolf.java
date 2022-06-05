package ru.javarush.island.units.animals.predator;

import ru.javarush.island.units.animals.Predator;

public class Wolf extends Predator {

    private static final int TRAVEL_DISTANCE = 3;
    private static final int STOMACH_VOLUME = 8;
    private static final int WEIGHT = 50;

    public Wolf(int positionX, int positionY) {
        super(positionX, positionY, TRAVEL_DISTANCE, STOMACH_VOLUME, WEIGHT);
    }
}
