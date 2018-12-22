package ru.sberbank;

public interface Person {
    boolean marry(Person person);

    void divorce();

    Person getSpouse();

    int getAge();

    Gender getGender();

    String getName();
}
