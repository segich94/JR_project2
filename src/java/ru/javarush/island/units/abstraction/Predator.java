package ru.javarush.island.units.abstraction;

import ru.javarush.island.units.abstraction.Animal;

public abstract class Predator extends Animal {


    public Predator(int positionX, int positionY, int travelDistance, int stomachVolume, int weight) {
        super(positionX, positionY, travelDistance, stomachVolume, weight);
    }
}
