package ru.mingazov.task7;



import java.util.logging.Level;
import java.util.logging.Logger;

import static java.util.logging.Level.*;
import static ru.mingazov.task7.Drinks.*;

public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        logger.log(Level.FINE,"Начало работы программы");
        VendingMachine vm = new VendingMachine();
        try {
            logger.log(FINE ,"Загрузка напитков в машину...");
            vm.setInsideVM(new Drinks[]{TEA, WATER, COLA, FANTA, COFFEE, JUICE});
        } catch (Exception e){
            logger.log(SEVERE,"Произошла ошибка при загрузке напитков в машину " + e.getStackTrace());
        }

        try {
            logger.log(FINE,"Вывод меню напитков на экран... ");
            vm.showMenu();
        } catch (Exception e){
            logger.log(SEVERE,"Произошла ошибка при выводе меню напитокв на экран " + e.getStackTrace());
        }

        try {
            logger.log(FINE,"В ожиданиии ввода денег... ");
            vm.setMoney();
        } catch (Exception e){
            logger.log(SEVERE,"Произошла ошибка при ожидании ввода денег " + e.getStackTrace());
        }

        try {
            logger.log(FINE,"Получены деньги = " + vm.getMoney() +
                    ", сейчас ожидаю ввода данных для выбора напитка... ");
            vm.setButton();
        } catch (Exception e){
            logger.log(SEVERE,"Произошла ошибка при вводе данных для выбора напитка " + e.getStackTrace());
        }

        try {
            logger.log(FINE,"Деньги " + vm.getMoney()+ " получены " +
                    " Выбран напиток под номером " + vm.getButton() +
                    " произвожу выдачу напитка согласно введенной информации," +
                    " при условии, что денежных средств достаточно...");
            vm.giveMeDrink();
        } catch (Exception e){
            logger.log(SEVERE,"Произошла ошибка при выдаче напитка " + e.getStackTrace());
        }

        logger.fine("Программа успешно завершенна");
    }
}
