package ru.javarush.island.processors;

import ru.javarush.island.field.GameField;
import ru.javarush.island.field.Location;

import java.util.concurrent.Phaser;

public class GrassProcessor implements Runnable{
    Phaser phaser;

    public GrassProcessor(Phaser phaser) {
        this.phaser = phaser;
        phaser.register();
    }

    public void growGrass(){
        GameField.getGameField().getListOfLocation().forEach(Location::generateGrass);
    }

    @Override
    public void run() {
        growGrass();
    }
}
