package ru.javarush.island.units.abstraction;

public abstract class Animal extends Units {
    public int travelDistance;
    public double stomachVolume;

    public Animal(int positionX, int positionY){
        super(positionX, positionY);
    }

    public void eat() {

    }

    public void move(){}

    public  Animal reproduce(){
        return null;
    }

}
