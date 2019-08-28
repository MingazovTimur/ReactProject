package ru.mingazov.task3;

import java.util.Scanner;

public class AboutNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        if (scanner.hasNextInt()) {
            about(scanner.nextInt());
        } else {
            System.out.println("Не понимаю, перезапустите программу и введите число!");
        }
    }

    public static void about (int a) {

        switch (Math.abs(a) % 2) {
            case 0:
                System.out.println("Число " + a + " чётное");
                break;

            case 1:
                System.out.println("Число " + a + " нечётное");
        }

        int sign = (int) Math.signum(a);
        switch (sign) {
            case -1:
                System.out.println("Отрицательное");
                break;

            case +1:
                System.out.println("Положительное");
                break;

            default:
                System.out.println("Число равно нулю");

        }

    }
}
