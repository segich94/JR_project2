package ru.javarush.island.units.animals.predator;

import ru.javarush.island.units.abstraction.Predator;
import ru.javarush.island.units.abstraction.Units;
import ru.javarush.island.units.animals.herbivore.Horse;


public class Wolf extends Predator {

    private static int TRAVEL_DISTANCE = 3;
    private static double STOMACH_VOLUME = 8.0;
    private static double WEIGHT = 50.0;


    public Wolf(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
