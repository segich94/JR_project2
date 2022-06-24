package ru.javarush.island;

import ru.javarush.island.settings.Settings;
import ru.javarush.island.units.abstraction.Units;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class CosoleDialog {
    Scanner scanner = new Scanner(System.in);
    List<String> stringUnits = Settings.unitsList.stream().map(o -> o.getClass().getSimpleName()).toList();
    Settings settings = new Settings();

    public void startDialog (){

        System.out.println("Welcome to the simulation");
        System.out.println(""" 
                Choose how to start:
                1. Start with default game settings
                2. Change settings
                3. Change island size
                4. Exit
                """);
        String answer = scanner.nextLine();
        switch (answer){
            case "1" -> new Game().start();
            case "2" -> changeAnimalSettings();
            case "3" -> changeFieldSize(scanner.nextLine());
            case "4" -> System.exit(1);
            default -> {
                System.out.println("Unknown symbol, enter the number");
                startDialog();
            }
        }
    }

    private void changeFieldSize(String string){
        String[] strings = string.split(" ");
        int height = Integer.parseInt(strings[0]);
        int width = Integer.parseInt(strings[1]);
        Settings.islandHeight = height;
        Settings.islandWidth = width;
    }

    private void changeAnimalSettings(){
        System.out.println("Which unit's settings need to be changed?");
        for (int i = 0; i < stringUnits.size(); i++) {
            System.out.println(i + ". " + stringUnits.get(i));
        }
        String answer = scanner.nextLine();
        int index = Integer.parseInt(answer);

        System.out.println("""
                What will we change?
                1. Unit characteristics (Speed, weight, stomach size)
                2. The probability of eating someone""");

        String answer2 = scanner.nextLine();
        switch (answer2){
            case "1" -> {
                System.out.println("Enter the characteristic and value separated by a space(speed, weight, stomach, maxinlocation)");
                String dataFromUser = scanner.nextLine();
                try {
                    changeAnimalCharacteristic(chooseUnits(index),dataFromUser);
                } catch (IllegalAccessException e) {
                    System.out.println("Error with changing settings");
                    e.printStackTrace();
                }
            }
            case "2" -> changeAnimalSettings();
            default -> {
                System.out.println("Unknown symbol, enter the number");
                startDialog();
            }
        }


    }

    private Units chooseUnits(int index){
        return Settings.unitsList.get(index);
    }

    private void changeAnimalCharacteristic(Units units, String userData) throws IllegalAccessException {
        String[] strings = userData.split(" ");
        int newValue = Integer.parseInt(strings[1]);
        String field = "";
        switch (strings[0].toLowerCase(Locale.ROOT)){
            case "speed" -> field = "TRAVEL_DISTANCE";
            case "weight" -> field = "WEIGHT";
            case "stomach" -> field = "STOMACH_VOLUME";
            case "maxinlocation" -> field = "MAX_COUNT_ON_LOCATION";
            default -> field = "";
        }
        settings.changeAnimalSettings(units,field,newValue);
    }
}
