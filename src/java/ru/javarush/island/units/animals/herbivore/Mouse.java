package ru.javarush.island.units.animals.herbivore;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.island.units.abstraction.Herbivore;
import ru.javarush.island.units.abstraction.Units;

@Getter
@Setter
public class Mouse extends Herbivore {

    private static int TRAVEL_DISTANCE = 1;
    private static double STOMACH_VOLUME = 0.01;
    private static double WEIGHT = 0.05;
    private static int MAX_COUNT_ON_LOCATION = 500;

    public Mouse(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    @Override
    public Mouse createNewOne(int positionX, int positionY) {
        return new Mouse(positionX,positionY);
    }
}
