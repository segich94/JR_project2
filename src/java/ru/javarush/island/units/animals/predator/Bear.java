package ru.javarush.island.units.animals.predator;

import ru.javarush.island.units.animals.Predator;

public class Bear extends Predator {
    private static final int TRAVEL_DISTANCE = 2;
    private static final int STOMACH_VOLUME = 80;
    private static final int WEIGHT = 500;

    public Bear(int positionX, int positionY) {
        super(positionX, positionY, TRAVEL_DISTANCE, STOMACH_VOLUME, WEIGHT);
    }
}
