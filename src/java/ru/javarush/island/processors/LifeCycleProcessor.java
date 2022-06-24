package ru.javarush.island.processors;

import ru.javarush.island.field.GameField;
import ru.javarush.island.field.Location;
import ru.javarush.island.field.UnitAction;
import ru.javarush.island.units.abstraction.Animal;
import ru.javarush.island.units.abstraction.Units;
import ru.javarush.island.units.plants.Grass;

import java.util.concurrent.Phaser;

public class LifeCycleProcessor extends Thread{
    Phaser phaser;
    private GameField gameField = GameField.getGameField();
    private Location location;
    private UnitAction action = new UnitAction();

    public LifeCycleProcessor(Phaser phaser, Location location) {
        this.phaser = phaser;
        this.location = location;
        phaser.register();

    }


    private void liveDay(Animal animal){
        if (animal.isDead)
            return;
        if(animal.saturation < animal.stomachVolume) {
            action.eat(animal, location);
        }
        action.reproduce(animal,location);
        action.move(animal,location);
        if (!animal.isMoved)
            action.move(animal,location);
    }

    private void liveLocationDay(){
        location.getUnits().stream()
                .filter(o-> !o.getClass().getSimpleName().equals(Grass.class.getSimpleName()))
                .map(o->(Animal)o)
                .peek(this::liveDay).count();
        location.phaseEnd = true;
    }

    @Override
    public void run() {
        while (true){
        phaser.arriveAndAwaitAdvance();
        liveLocationDay();}

    }
}
