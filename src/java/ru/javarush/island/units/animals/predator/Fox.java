package ru.javarush.island.units.animals.predator;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.island.units.abstraction.Predator;
@Getter
@Setter
public class Fox extends Predator {

    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 2.0;
    private static double WEIGHT = 8.0;
    private static int MAX_COUNT_ON_LOCATION = 30;

    public Fox(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
