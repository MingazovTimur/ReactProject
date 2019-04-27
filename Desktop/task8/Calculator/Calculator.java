package ru.mingazov.task8.Calculator;

import java.util.Scanner;

public class Calculator {
    Scanner scanner = new Scanner(System.in);

    //Методы для сложения
    static int sum (int a, int b){

        return a + b;
    }

    static double sum(double a, int b){
        return a + b;
    }

    static double sum(int a, double b){
        return a + b;
    }

    static double sum(double a, double b){
        return a + b;
    }

    //Методы вычитания
    static int deduct (int a, int b){
        return a- b;
    }

    static double deduct(double a, int b){
        return a - b;
    }

    static double deduct(int a, double b){
        return a - b;
    }

    static double deduct(double a, double b){
        return a - b;
    }

    //Методы умножения
    static int multiply (int a, int b){
        return a * b;
    }

    static double multiply(double a, int b){
        return a * b;
    }

    static double multiply(int a, double b){
        return a * b;
    }

    static double multiply(double a, double b){
        return a * b;
    }

    //Методы деления

    static double divide (int a, int b){
        double c = (double) a;
        return c / b;
    }

    static double divide(double a, int b){
        return a / b;
    }

    static double divide(int a, double b){
        double c = (double) a;
        return  c / b;
    }


    static double divide(double a, double b){
        return a / b;
    }

    //Метод взятия процента от числа
    static double takePercent (int a, int Percent){
        double reallyPercent = (double) Percent / 100;
        return a * reallyPercent;
    }

    static double takePercent(double a, int Percent){
        double reallyPercent = (double) Percent / 100;
        return a * reallyPercent;
    }

    static double takePercent(int a, double Percent){
        double reallyPercent = Percent / 100;
        return a * reallyPercent;
    }

    static double takePercent(double a, double Percent){
        double reallyPercent = Percent / 100;
        return a * reallyPercent;
    }
}

