package org.example.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        System.out.println( summa(67,12));
        value(6);
        System.out.println(sign(7));
        print("Hello world!");
        System.out.println(year(800));
    }

    public static <r> boolean summa(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    public static void value(int a) {
        if (a >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }

    }
    public static boolean sign(int a) {
        return (a>=0);
    }

    public static void print(String a) {
        for (int i = 0; i < 5; i++) {
            System.out.println(a);
        }
    }

    public static boolean year(int a) {
        return ((a % 4==0) && (a % 100!=0)) || (a % 400==0);


        }
    }


