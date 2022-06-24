package ru.javarush.island.processors;

import ru.javarush.island.field.GameField;
import ru.javarush.island.field.Location;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Phaser;

public class StatisticProcessor extends Thread {
    Phaser phaser;
    private int countDay = 0;
    private GameField gameField = GameField.getGameField();

    public StatisticProcessor(Phaser phaser) {
        this.phaser = phaser;
        phaser.register();
    }

    public Map<String,Integer> countLiveUnits(){
        Map<String,Integer> liveUnits = new HashMap<>();
        GameField.getGameField().getListOfLocation().forEach(location -> location.getUnits()
                .forEach(unit -> liveUnits.merge(unit.getClass().getSimpleName(),1,(prev, one) -> prev + 1)));
        return liveUnits;
    }
    public String statistics(){

        StringBuilder stringBuilder = new StringBuilder();
        countLiveUnits().forEach((key,value) -> stringBuilder.append(key + " " + value + "\n"));
        return stringBuilder.toString();
    }

    @Override
    public void run() {

        while (true){
            countLiveUnits();
            System.out.println("День - "+ countDay);
            System.out.println(statistics());
            countDay++;
            phaser.arriveAndAwaitAdvance();}
    }
}
