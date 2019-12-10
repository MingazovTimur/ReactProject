package ru.mingazov.task3;

import java.util.Scanner;

public class GeometricProegression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов прогрессии ");
        int n           = scanner.nextInt();        //Кол-во элементов прогрессии
        System.out.println("Введите знаменатель прогрессии");
        double step     = scanner.nextInt();        //Модуль ступени прогрессии
        if (n > 0) {
            double[] array = new double[n];         //Array куда будет складываться прогрессия
            for   (int i   = 0; i < n; i++) {       //Цикл повышающий каждую новую ступень прогресси в "step" раз
                array[i]   = Math.pow(step, i+1);
            }
            for (double v : array) {
                System.out.println(v);
            }
        } else {
            System.out.println("Нечитаемое число, перезапустите программу и введите положительно число для количество " +
                    "элементов прогресси");
        }
    }
}

