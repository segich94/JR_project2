package ru.javarush.island.field;

import ru.javarush.island.settings.Settings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameField {
    private static final GameField GAME_FIELD = new GameField();
    private Location [][] locations;
    private List<Location> listOfLocation = new ArrayList<>();
    private int islandWidth = Settings.islandWidth;
    private int islandHeight = Settings.islandHeight;

    private GameField(){
    }

    public static GameField getGameField(){
        return GAME_FIELD;
    }

    public void initMap(){
        locations = new Location[islandWidth][islandHeight];
        for (int i = 0; i < islandHeight; i++) {
            for (int j = 0; j < islandWidth; j++) {
                locations[j][i] = new Location(j,i);
                listOfLocation.add(locations[j][i]);
            }
        }
    }

    public List<Location> getListOfLocation(){
        return listOfLocation;
    }

    public Location getLocation(int x, int y){
        return locations[x][y];
    }

    public boolean isLocationInField(int x, int y){
        if (x < 0 || y < 0 || x >= locations.length || y >= locations[0].length)
            return false;
        return true;
    }

    public void initGameMap(){
        listOfLocation.forEach(Location::initLocation);
    }




}
