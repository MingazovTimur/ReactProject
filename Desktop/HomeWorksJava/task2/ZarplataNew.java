package ru.mingazov.task2;

import java.util.Scanner;

public class ZarplataNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сумма заработной платы:  ");
        int    salary   = scanner.nextInt();    //Зарплата на руки
        double tax      = salary * 0.13;                 //Налог
        double clearSum = salary - tax;         //Чистая зарплата после вычета налогов
        System.out.print("Чистая зарплата от " + salary + " будет равна " + clearSum);
        System.out.print(" за вычетом 13: налогов в размере " + tax);
    }
}
