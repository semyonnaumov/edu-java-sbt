package ru.sberbank.basic;

import ru.sberbank.oop.Calculator;
import ru.sberbank.oop.SimpleCalculator;
import ru.sberbank.oop.Student;

public class Main {
    public static void main(String[] args) {

        // Примитиные типы - переменная хранит значение
        byte b = 40; //2^8=256 -128...127
        short s = 100; //2^16=65536 -32000...32000
        int i = 100000; //2^32 = 4 млрд
        long l = 10000000000000000L; //2^64
        long ll = 132_354_513_213L;

        float f = 1256.2644f; //все пишут с double
        double d = 127.25;

        char c = 'T'; // 16 bit - 0...65536
        int i2 = c; // UTF - 16 code
        boolean bool = false;

        // Ссылочные типы - переменная хранит ссылку
        // Классы - обертки
        Student alex = new Student("Alex", 24);
        Student maria = new Student(20);

        maria.sayHello();

        Calculator calculator = new SimpleCalculator();
        run(calculator);
    }

    private static void run(Calculator calculator) {
        int sum = calculator.sum("20", "15");
        System.out.println(sum);
    }
}
