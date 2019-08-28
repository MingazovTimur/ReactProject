package ru.mingazov.task2;


import java.util.Scanner;

public class BenzinNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите необходимый объем бензина:  ");
        int value = scanner.nextInt();
        int price = 47;
        int sum = price * value;
        System.out.println("Стоимость " + value + " литров бензина = " + sum);


    }
}
