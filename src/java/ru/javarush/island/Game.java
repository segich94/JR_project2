package ru.javarush.island;

import ru.javarush.island.field.GameField;
import ru.javarush.island.processors.LifeCycleProcessor;
import ru.javarush.island.processors.StatisticProcessor;

import java.util.concurrent.Phaser;

public class Game {
    private static GameField gameField = GameField.getGameField();


    public static void main(String[] args) {
        gameField.initMap();
        gameField.initGameMap();
        new Game().start();
    }

    public void start(){
        Phaser phaser = new Phaser();
        new StatisticProcessor(phaser).start();
        GameField.getGameField().getListOfLocation().forEach(location -> new LifeCycleProcessor(phaser,location).start());


    }
}
