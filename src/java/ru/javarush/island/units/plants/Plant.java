package ru.javarush.island.units.plants;

import ru.javarush.island.units.Units;

public abstract class Plant extends Units {
    int weight;

    public Plant(int[][] position, int weight) {
        super(position);
        this.weight = weight;
    }
}
