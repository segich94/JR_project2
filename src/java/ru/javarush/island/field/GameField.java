package ru.javarush.island.field;

import ru.javarush.island.settings.Settings;

import java.util.HashMap;
import java.util.Map;

public class GameField {
    private static GameField GAME_FIELD = new GameField();

    private Location [][] locations;

    private GameField(){}

    public static GameField getGameField(){
        return GAME_FIELD;
    }

    public void initMap(){
        locations = new Location[Settings.islandWidth][Settings.islandHeight];
        for (int i = 0; i < Settings.islandHeight; i++) {
            for (int j = 0; j < Settings.islandWidth; j++) {
                locations[i][j] = new Location(i,j);

            }
        }

    }



}
