package ru.javarush.island.units.abstraction;

public abstract class Plant extends Units {
    int weight;

    public Plant(int[][] position, int weight) {
        super(position);
        this.weight = weight;
    }
}
