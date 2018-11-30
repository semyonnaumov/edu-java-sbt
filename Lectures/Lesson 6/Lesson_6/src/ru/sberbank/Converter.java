package ru.sberbank;

import java.util.List;

public interface Converter<T> {
    T converter(List<Object> o);
}
