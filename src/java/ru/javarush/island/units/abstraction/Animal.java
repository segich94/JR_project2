package ru.javarush.island.units.abstraction;

public abstract class Animal extends Units {
    public int travelDistance;
    public double stomachVolume;
    public double saturation;
    public boolean isMultiplied = false;
    public boolean isMoved = false;

    public Animal(int positionX, int positionY){
        super(positionX, positionY);
    }

}
