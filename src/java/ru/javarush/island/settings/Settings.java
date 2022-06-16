package ru.javarush.island.settings;

import ru.javarush.island.units.animals.herbivore.*;
import ru.javarush.island.units.animals.predator.*;
import ru.javarush.island.units.plants.Grass;

import java.util.ArrayList;
import java.util.List;

public class Settings {

    List<Class> unitsClass = new ArrayList<>();
    int[][] chanceToEat = {
            {0,0,0,0,0,10,15,60,80,60,70,15,10,40,0,0},
            {0,0,15,0,0,0,0,20,40,0,0,0,0,10,0,0},
            {0,0,0,0,0,0,0,70,90,0,0,0,0,60,40,0},
            {0,80,0,0,0,40,80,80,90,70,70,50,20,10,0,0},
            {0,0,10,0,0,0,0,90,90,0,0,0,0,80,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,90,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100},
            {0,0,0,0,0,0,0,0,50,0,0,0,0,0,90,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,90,100},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100}
    };

    {
        unitsClass.add(Wolf.class);
        unitsClass.add(Boa.class);
        unitsClass.add(Fox.class);
        unitsClass.add(Bear.class);
        unitsClass.add(Eagle.class);
        unitsClass.add(Horse.class);
        unitsClass.add(Deer.class);
        unitsClass.add(Rabbit.class);
        unitsClass.add(Mouse.class);
        unitsClass.add(Goat.class);
        unitsClass.add(Sheep.class);
        unitsClass.add(Hog.class);
        unitsClass.add(Buffalo.class);
        unitsClass.add(Duck.class);
        unitsClass.add(Caterpillar.class);
        unitsClass.add(Grass.class);
    }
}
