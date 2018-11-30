package ru.sberbank;

public class Main {
    public static void main(String[] args) {
        Person dima = new PersonImpl("Dima", 20, Gender.MALE);
        Person sveta = new PersonImpl("Sveta", 18, Gender.FEMALE);
        Person vasya = new PersonImpl("Vasya", 50, Gender.MALE);
        Person anya = new PersonImpl("Anya", 16, Gender.FEMALE);

        marry(dima, sveta);
        marry(dima, sveta);
        marry(vasya, sveta);
        marry(anya, sveta);
        marry(dima, vasya);
        marry(anya, vasya);
        Person a =
    }

    public static void marry(Person per1, Person per2) {
        System.out.println("Attempting to marry\n" + per1.toString() + "\nwith\n" + per2.toString());
        boolean result = per1.marry(per2);
        System.out.println("Result = " + result);
    }
}
