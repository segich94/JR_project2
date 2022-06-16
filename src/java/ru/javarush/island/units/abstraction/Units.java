package ru.javarush.island.units.abstraction;

public abstract class Units {
    public double weight;
    public int positionX;
    public int positionY;

    public Units(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }
}
