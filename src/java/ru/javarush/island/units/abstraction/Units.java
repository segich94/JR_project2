package ru.javarush.island.units.abstraction;

import ru.javarush.island.field.GameField;
import ru.javarush.island.field.Location;
import ru.javarush.island.field.Sandbox;

public abstract class Units {
    public int maxCountOnLocation;
    public double weight;
    public int positionX;
    public int positionY;
    public boolean isDead = false;


    public Units(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;

        if (GameField.getGameField() == null)
            Sandbox.sandbox[0][0] = new Location(positionX,positionY);
        else
        GameField.getGameField().getLocation(positionX,positionY).addUnitInLocation(this);
    }

    public abstract Units createNewOne(int positionX, int positionY);
}
