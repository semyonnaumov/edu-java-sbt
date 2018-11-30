package ru.sberbank.oop;

public class Student {
    private final String name;
    private final int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Student(String name){
        this(name, 20);
    }

    public Student(int age){
        this("NoName", age);
    }

    public String getName(){
        return name;
    }



    public void sayHello(){
        System.out.println("Hello, I'm " + name + ", " + age + " old.");

    }
}
