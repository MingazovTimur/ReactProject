package ru.mingazov.task3;


import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число прогрессии");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите кол-во элементов прогрессии ");
        int n           = scanner.nextInt();         //Кол-во элементов прогрессии
        System.out.println("Введите разность прогрессии");
        int step        = scanner.nextInt();         //Модуль ступени прогрессии
        if (n > 0) {
            int[] array = new int[n];         //Array куда будет складываться прогрессия
            for (int i = 0; i < n; i++) {           //Цикл повышающий каждую новую ступень прогресси в "step" раз
                array[i] = firstNumber + (i * step);
            }
            for (int v : array) {
                System.out.println(v);
            }
        } else {
            System.out.println("Нечитаемое число, перезапустите программу и введите положительно число для количествa " +
                    "элементов прогрессии");
        }
    }
}
