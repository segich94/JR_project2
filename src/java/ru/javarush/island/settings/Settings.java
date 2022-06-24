package ru.javarush.island.settings;

import ru.javarush.island.units.abstraction.Units;
import ru.javarush.island.units.animals.herbivore.*;
import ru.javarush.island.units.animals.predator.*;
import ru.javarush.island.units.plants.Grass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Settings {



    public static int islandWidth = 20;
    public static int islandHeight = 100;
    public static List<Class<? extends Units>> unitsClass = new ArrayList<>();
    public static List<Units> unitsList = Arrays.asList(new Wolf(0,0),
            new Boa(0,0),
            new Fox(0,0),
            new Bear(0,0),
            new Eagle(0,0),
            new Horse(0,0),
            new Deer(0,0),
            new Rabbit(0,0),
            new Mouse(0,0),
            new Goat(0,0),
            new Sheep(0,0),
            new Hog(0,0),
            new Buffalo(0,0),
            new Duck(0,0),
            new Caterpillar(0,0),
            new Grass(0,0));

    public static int[][] chanceToEat = {
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

}
