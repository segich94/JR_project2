package ru.javarush.island.units.abstraction;

import ru.javarush.island.field.GameField;

public abstract class Units {
    public int maxCountOnLocation;
    public double weight;
    public int positionX;
    public int positionY;
    public boolean isDead = false;

    public Units(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        GameField.getGameField().getLocation(positionX,positionY).addUnitInLocation(this);
    }

    public abstract Units createNewOne(int positionX, int positionY);
}
