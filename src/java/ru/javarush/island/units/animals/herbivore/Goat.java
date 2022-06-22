package ru.javarush.island.units.animals.herbivore;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.island.units.abstraction.Herbivore;
@Getter
@Setter
public class Goat extends Herbivore {

    private static int TRAVEL_DISTANCE = 3;
    private static double STOMACH_VOLUME = 10.0;
    private static double WEIGHT = 60.0;
    private static int MAX_COUNT_ON_LOCATION = 140;

    public Goat(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }
}
