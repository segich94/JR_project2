package ru.javarush.island.units.animals.herbivore;



import ru.javarush.island.units.abstraction.Herbivore;


public class Sheep extends Herbivore {

    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 15.0;
    private static double WEIGHT = 70.0;
    private static int MAX_COUNT_ON_LOCATION = 140;

    public Sheep(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    public Sheep createNewOne(int positionX, int positionY) {
        return new Sheep(positionX, positionY);
    }
}
