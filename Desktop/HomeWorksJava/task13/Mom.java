package ru.mingazov.task13;

import java.util.Scanner;


public class Mom extends Child {
    public static void main(String[] args) {
        Mom mom = new Mom();
        mom.showFood();
        try {
            mom.CheckNumberAndDoEat();
        } catch (UncorrectSymbolException e) {
            System.out.println(e.getMessage());
        }


    }



    public void showFood(){
        System.out.println("Доступная еда");
        System.out.println("Нажмите соответствующую клавишу для выбора:");
        for (FoodList i : FoodList.values()) {
            System.out.println(i.getChoice() + ". " + i.getName());
            System.out.println("_________________________________");
        }
    }
}