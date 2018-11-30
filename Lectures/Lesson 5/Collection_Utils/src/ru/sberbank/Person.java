package ru.sberbank;

public class Person implements Comparable {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
