package ru.javarush.island.units.animals.herbivore;

import lombok.Getter;
import lombok.Setter;
import ru.javarush.island.units.abstraction.Herbivore;
import ru.javarush.island.units.abstraction.Units;

@Getter
@Setter
public class Rabbit extends Herbivore {

    private static int TRAVEL_DISTANCE = 2;
    private static double STOMACH_VOLUME = 0.45;
    private static double WEIGHT = 2.0;
    private static int MAX_COUNT_ON_LOCATION = 150;

    public Rabbit(int positionX, int positionY) {
        super(positionX, positionY);
        this.weight = WEIGHT;
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.stomachVolume = STOMACH_VOLUME;
        this.travelDistance = TRAVEL_DISTANCE;
        this.saturation = stomachVolume/2.0;
    }

    @Override
    public Rabbit createNewOne(int positionX, int positionY) {
        return new Rabbit(positionX, positionY);
    }
}
