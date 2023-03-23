package ru.javarush.island;

import ru.javarush.island.field.GameField;
import ru.javarush.island.processors.LifeCycleProcessor;
import ru.javarush.island.processors.StatisticProcessor;

import java.util.concurrent.Phaser;

public class Game {
    private static GameField gameField = GameField.getGameField();


    public static void main(String[] args) {
        new CosoleDialog().startDialog();

    }

    public void start(){
        gameField.initMap();
        gameField.initGameMap();
        Phaser phaser = new Phaser();
        new StatisticProcessor(phaser).start();
        GameField.getGameField().getListOfLocation().forEach(location -> new LifeCycleProcessor(phaser,location).start());


    }
}
