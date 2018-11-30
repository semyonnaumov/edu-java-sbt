package ru.sberbank;

public class Child extends Person {
    private int age;

    public Child(String name, int age) {
        super(name);
        this.age = age;
    }

    public Child() {
        this("nobody", 0);
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                '}';
    }
}
