package ru.mingazov.task13;


import java.util.Scanner;

import static ru.mingazov.task13.FoodList.*;

public class Child {

    Scanner scanner = new Scanner(System.in);
    protected int numberOfChoice;

    public void CheckNumberAndDoEat() throws UncorrectSymbolException {
        System.out.print("Введите число для выбора еды ");
        if (!scanner.hasNextInt()){
            throw new UncorrectSymbolException("Введён неккоретный символ, перезапустите программу");
        } else {
            doEat();
        }
    }


    public void doEat() {
        numberOfChoice = scanner.nextInt();
        if (numberOfChoice == EGG.getChoice()){
            System.out.println("Съел " + EGG.getName());
            try {
                if (EGG.getTaste().equals("Не вкусно")){
                    throw new BadFoodException("Невкусная еда");
                } else {
                    System.out.println("Ням-ням, очень вкусно");
                }
            } catch (BadFoodException e) {
                System.out.println("Кхе-кхе");
            } finally {
                System.out.println("Спасибо, мам");
            }
        } else if (numberOfChoice == VEGETABLES.getChoice()) {
            System.out.println("Съел " + VEGETABLES.getName());
            try {
                if (VEGETABLES.getTaste().equals("Не вкусно")) {
                    throw new BadFoodException("Невкусная еда");
                } else {
                    System.out.println("Ням-ням, очень вкусно");
                }
            } catch (BadFoodException e) {
                System.out.println("Кхе-кхе");
            } finally {
                System.out.println("Спасибо, мам");
            }
        } else if (numberOfChoice == PORRIDGE.getChoice()) {
            System.out.println("Съел " + PORRIDGE.getName());
            try {
                if (PORRIDGE.getTaste().equals("Не вкусно")) {
                    throw new BadFoodException("Невкусная еда");
                } else {
                    System.out.println("Ням-ням, очень вкусно");
                }
            } catch (BadFoodException e) {
                System.out.println("Кхе-кхе");
            } finally {
                System.out.println("Спасибо, мам");
            }
        } else if (numberOfChoice == SAUSAGE.getChoice()) {
            System.out.println("Съел " + SAUSAGE.getName());
            try {
                if (SAUSAGE.getTaste().equals("Не вкусно")) {
                    throw new BadFoodException("Невкусная еда");
                } else {
                    System.out.println("Ням-ням, очень вкусно");
                }
            } catch (BadFoodException e) {
                System.out.println("Кхе-кхе");
            } finally {
                System.out.println("Спасибо, мам");
            }
        } else if (numberOfChoice == FISH.getChoice()) {
            System.out.println("Съел " + FISH.getName());
            try {
                if (FISH.getTaste().equals("Не вкусно")) {
                    throw new BadFoodException("Невкусная еда");
                } else {
                    System.out.println("Ням-ням, очень вкусно");
                }
            } catch (BadFoodException e) {
                System.out.println("Кхе-кхе");
            } finally {
                System.out.println("Спасибо, мам");
            }
        } else {
            System.out.println("Еды под таким номером в меню нет");
        }





    }

}
