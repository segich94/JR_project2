package ru.javarush.island.units.animals.predator;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.island.units.abstraction.Predator;
@Getter
@Setter
public class Boa extends Predator {
    private static int TRAVEL_DISTANCE = 1;
    private static double STOMACH_VOLUME = 3.0;
    private static double WEIGHT = 15.0;
    private static int MAX_COUNT_ON_LOCATION = 30;

    public Boa(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    public Boa createNewOne(int positionX, int positionY) {
        return new Boa(positionX, positionY);
    }
}
