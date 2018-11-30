package ru.sberbank;

import java.lang.reflect.Field;

public class ReflectionUtils {
    public static void printAllFields(Object o) throws IllegalAccessException {
        Class<?> clazz = o.getClass();
        while (clazz != null) {
            for (Field field : clazz.getDeclaredFields()) {
                field.setAccessible(true);

                System.out.println(
                        field.getName() + " = " + field.get(o)
                );
            }
        }
    }
}
