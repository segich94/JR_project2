package ru.javarush.island.field;

import ru.javarush.island.settings.Settings;
import ru.javarush.island.units.abstraction.Units;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class UnitAction {





    /*public List<? extends Units> generateUnits(int xCoordinate, int yCoordinate){
        List<Units> result = new ArrayList<>();
        Constructor constructor = null;

        for (Class clazz: Settings.unitsClass){
            int maxCount = 0;
            try {
                Field field = clazz.getClass().getDeclaredField("MAX_COUNT_ON_LOCATION");
                field.setAccessible(true);
                maxCount = (int) field.get(clazz);
                field.setAccessible(false);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
            int random = ThreadLocalRandom.current().nextInt(0,maxCount+1);

            try {
                constructor = clazz.getConstructor(int.class, int.class);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < random; i++) {
                try {
                    result.add((Units) constructor.newInstance(xCoordinate,yCoordinate));
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }
    }*/
}
