package ru.mingazov.task7;


import java.util.Scanner;

import static ru.mingazov.task7.Drinks.*;

public class App {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.setInsideVM(new Drinks[]{TEA, WATER, COLA, FANTA, COFFEE, JUICE});
        vm.showMenu();
        vm.setMoney();
        vm.setButton();
        vm.giveMeDrink();

    }
}
