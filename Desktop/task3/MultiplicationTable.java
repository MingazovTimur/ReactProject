package ru.mingazov.task3;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int a = 1; a < 11; a++) {
            for(int b = 1; b < 11; b++) {
                System.out.print(a * b + "  ");
            }
            System.out.println(" ");
            }
        }
    }
