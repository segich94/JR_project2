package ru.javarush.island.units.animals.predator;



import ru.javarush.island.units.abstraction.Predator;




public class Wolf extends Predator {

    private static int TRAVEL_DISTANCE = 3;
    private static double STOMACH_VOLUME = 8.0;
    private static double WEIGHT = 50.0;
    private static int MAX_COUNT_ON_LOCATION = 30;


    public Wolf(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }


    public Wolf createNewOne(int positionX, int positionY) {
        return new Wolf(positionX, positionY);
    }
}
