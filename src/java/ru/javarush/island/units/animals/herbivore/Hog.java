package ru.javarush.island.units.animals.herbivore;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.island.units.abstraction.Herbivore;
@Getter
@Setter
public class Hog extends Herbivore {
    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 50.0;
    private static double WEIGHT = 400.0;
    private static int MAX_COUNT_ON_LOCATION = 50;

    public Hog(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    @Override
    public Hog createNewOne(int positionX, int positionY) {
        return new Hog(positionX, positionY);
    }
}
