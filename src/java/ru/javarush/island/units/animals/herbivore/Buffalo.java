package ru.javarush.island.units.animals.herbivore;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.island.units.abstraction.Herbivore;
import ru.javarush.island.units.abstraction.Units;

@Getter
@Setter
public class Buffalo extends Herbivore {
    private static int TRAVEL_DISTANCE = 3;
    private static double STOMACH_VOLUME = 100.0;
    private static double WEIGHT = 700.0;
    private static int MAX_COUNT_ON_LOCATION = 10;

    public Buffalo(int positionX, int positionY) {
        super(positionX, positionY);
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.weight = WEIGHT;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
    }

    @Override
    public Buffalo createNewOne(int positionX, int positionY) {
        return new Buffalo(positionX,positionY);
    }

}
