package ru.javarush.island.units.animals.herbivore;



import ru.javarush.island.units.abstraction.Herbivore;
import ru.javarush.island.units.abstraction.Units;

public class Caterpillar extends Herbivore {
    private static int TRAVEL_DISTANCE = 0;
    private static double STOMACH_VOLUME = 0.0;
    private static double WEIGHT = 0.01;
    private static int MAX_COUNT_ON_LOCATION = 1000;

    public Caterpillar(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    @Override
    public Caterpillar createNewOne(int positionX, int positionY) {
        return new Caterpillar(positionX, positionY);
    }
}
