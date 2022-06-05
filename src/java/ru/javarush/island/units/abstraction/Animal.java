package ru.javarush.island.units.abstraction;

public abstract class Animal extends Units {
    int travelDistance;
    int stomachVolume;
    int weight;

    public Animal(int positionX, int positionY, int travelDistance, int stomachVolume, int weight) {
        super(positionX, positionY);
        this.travelDistance = travelDistance;
        this.stomachVolume = stomachVolume;
        this.weight = weight;
    }

    public void eat() {

    }

    public void move(){}

    public  Animal reproduce(){
        return null;
    }

}
