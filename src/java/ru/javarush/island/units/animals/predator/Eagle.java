package ru.javarush.island.units.animals.predator;



import ru.javarush.island.units.abstraction.Predator;


public class Eagle extends Predator {
    private static int TRAVEL_DISTANCE = 3;
    private static double STOMACH_VOLUME = 1.0;
    private static double WEIGHT = 6.0;
    private static int MAX_COUNT_ON_LOCATION = 20;


    public Eagle(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    public Eagle createNewOne(int positionX, int positionY) {
        return new Eagle(positionX, positionY);
    }
}
