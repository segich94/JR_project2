package ru.javarush.island.units.plants;



import ru.javarush.island.units.abstraction.Plant;
import ru.javarush.island.units.abstraction.Units;


public class Grass extends Plant {

    private static double WEIGHT = 1.0;
    private static int MAX_COUNT_ON_LOCATION = 200;

    public Grass(int positionX, int positionY) {
        super(positionX, positionY);
        this.maxCountOnLocation = MAX_COUNT_ON_LOCATION;
        this.weight = WEIGHT;

    }

    @Override
    public Grass createNewOne(int positionX, int positionY) {
        return new Grass(positionX, positionY);
    }
}
