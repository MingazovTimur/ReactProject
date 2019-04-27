package ru.mingazov.task7;


import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import static ru.mingazov.task7.Drinks.*;

public class VendingMachine {

    Scanner scanner = new Scanner(System.in);

    private Drinks[] insideVM = new Drinks[6];

    public Drinks[] getInsideVM() {
        return insideVM;
    }

    public void setInsideVM(Drinks[] insideVM) {
        this.insideVM = insideVM;
    }

    private int money;

    public int getMoney() {
        return money;
    }

    public void setMoney() {
        System.out.print("Введите деньги ");
        if(scanner.hasNextInt()){
            money = scanner.nextInt();
        } else {
            System.out.println("Как Вы умудрились ввести не сумму, а что-то другое?");
        }
    }

    private int button;

    public int getButton() {
        return button;
    }

    public void setButton() {
        System.out.print("Введите клавишу для выбора напитка ");
        if(scanner.hasNextInt()){
            button = scanner.nextInt();
        } else {
            System.out.println("Введена некорректная информация, заберите Ваши " + getMoney() +
                    " и перезапустите программу" );
        }
    }

    public void giveMeDrink() {switch (button) {
        case 1:
            if (money >= TEA.getPrice()) {
                System.out.println("Заберите Ваш напиток " + TEA.getName() + " и Сдачу " + (money - TEA.getPrice()));
            } else {
                System.out.println("Недостаточно средств, заберите Ваши " + money + " и перезапустите программу");
            }
            break;
        case 2:
            if (money >= WATER.getPrice()) {
                System.out.println("Заберите Ваш напиток " + WATER.getName() + " и Сдачу " + (money - WATER.getPrice()));
            } else {
                System.out.println("Недостаточно средств, заберите Ваши " + money + " и перезапустите программу");
            }
            break;
        case 3:
            if (money >= COLA.getPrice()) {
                System.out.println("Возьмите Ваш напиток " + COLA.getName() + " и Сдачу " + (money - COLA.getPrice()));
            } else {
                System.out.println("Недостаточно средств, заберите Ваши " + money + " и перезапустите программу");
            }
            break;
        case 4:
            if (money >= FANTA.getPrice()) {
                System.out.println("Возьмите Ваш напиток " + FANTA.getName() + " и Сдачу " + (money - FANTA.getPrice()));
            } else {
                System.out.println("Недостаточно средств, заберите Ваши " + money + " и перезапустите программу");
            }
            break;
        case 5:
            if (money >= COFFEE.getPrice()) {
                System.out.println("Возьмите Ваш напиток " + COFFEE.getName() + " и Сдачу " + (money - COFFEE.getPrice()));
            } else {
                System.out.println("Недостаточно средств, заберите Ваши " + money + " и перезапустите программу");
            }
            break;
        case 6:
            if (money >= JUICE.getPrice()) {
                System.out.println("Возьмите Ваш напиток " + JUICE.getName() + " и Сдачу " + (money - JUICE.getPrice()));
            } else {
                System.out.println("Недостаточно средств, заберите Ваши " + money + " и перезапустите программу");
            }
            break;
        default:
            System.out.println("Введено некорректное число, заберите Ваши " + money +
                    " пожалуйста перезапустите программу");
    }

    }




    @Override
    public String toString() {
        return " Доступно для покупки: " + '\n' +
                 Arrays.toString(insideVM);
    }

    public void showMenu(){
        for (Drinks i: Drinks.values()){
            System.out.println(i.getButton() + ": " + i.getName() + " - " + i.getPrice() + " Рублей");
            System.out.println("__________________________________");
        }
    }
}
