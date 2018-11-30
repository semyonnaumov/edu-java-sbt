package ru.sberbank;

import java.lang.reflect.Field;
import java.util.List;

public class ToXmlConverter<T> implements Converter<String> {
    @Override
    public String converter(List<Object> o) {
        StringBuilder xml = new StringBuilder();
        Class<?> rootClazz = o.get(0).getClass();
        xml.append("<root-" + rootClazz.getSimpleName() + ">");

        for (Object item : o) {
            Class<?> clazz = item.getClass();
            String simpleName

            while (true) {
                for (Field field : clazz.getDeclaredFields()) {
                    field.setAccessible(true);

                    System.out.println(
                            field.getName() + " = " + field.get(o)
                    );
                }
            }
        }

    }
}
