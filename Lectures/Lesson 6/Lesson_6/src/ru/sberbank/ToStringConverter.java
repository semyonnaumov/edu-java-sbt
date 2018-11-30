package ru.sberbank;

import java.util.List;

public class ToStringConverter<String> implements Converter<String> {
    @Override
    public String converter(List<Object> o) {
        StringBuilder s = new StringBuilder();
        for (Object o1 : o) {
            s.append(o1.toString() + "\n");
        }
        return (String) s.toString();
    }
}
