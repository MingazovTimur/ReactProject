package ru.mingazov.task2;

import java.util.Scanner;

public class TimeNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Часы:  ");
        int hours = scanner.nextInt();
        int minutes = 60 * hours;
        int seconds = 60 * minutes;
        double days =  hours/24.0;
        float year  = (float) days/364.0f;
        System.out.println("В " + hours + " часах " + minutes + " минут и " + seconds + " секунд");
        System.out.println(hours + " Это " + days + " дня и " + year + " года");
    }
}

