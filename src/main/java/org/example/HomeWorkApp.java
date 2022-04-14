package org.example;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задание1");
        printThreeWords();
        System.out.println("Задание2");
        checkSumSign();
        System.out.println("Задание3");
        printColor();
        System.out.println("Задание4");
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");


    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 12;
        b = 92;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b <= 0) {
            System.out.println("Сумма отрицательная");
        }


    }

    public static void printColor() {
        int value = 12;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value <= 100 || value >= 0) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 19;
        if (a >= b) {
            System.out.println("\"a>=b\"");
        } else {
            System.out.println("\"a<b\"");
        }
    }
}

