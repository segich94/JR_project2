package ru.javarush.island.field;

public class GameField {
    private int height = 100;
    private int width = 20;
    private static final GameField INSTANCE = new GameField();

    private GameField() {
    }


}
