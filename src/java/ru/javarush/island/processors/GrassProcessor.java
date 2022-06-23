package ru.javarush.island.processors;

import ru.javarush.island.field.GameField;
import ru.javarush.island.field.Location;

public class GrassProcessor {


    public void growGrass(){
        GameField.getGameField().getListOfLocation().forEach(Location::generateGrass);
    }
}
