package ru.javarush.island.units.animals.herbivore;



import ru.javarush.island.units.abstraction.Herbivore;
import ru.javarush.island.units.abstraction.Units;



public class Horse extends Herbivore {

    private static int TRAVEL_DISTANCE = 4;
    private static double STOMACH_VOLUME = 60.0;
    private static double WEIGHT = 400.0;
    private static int MAX_COUNT_ON_LOCATION = 20;

    public Horse(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    @Override
    public Horse createNewOne(int positionX, int positionY) {
        return new Horse(positionX, positionY);
    }
}
