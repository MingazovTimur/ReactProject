package ru.mingazov.task1;

public class Zarplata {
    public static void main(String[] args) {
        int    salary   = 55000;                //Зарплата на руки
        double afterTax = 0.87;                 //Индекс зарплаты после вычета налога в 13%
        double clearSum = salary * afterTax;    //Чистая зарплата после вычета налогов
        System.out.print("Чистая зарплата от " + salary + " будет равна " + clearSum);
    }
}

