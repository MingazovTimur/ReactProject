package ru.mingazov.task8.counter;

public class Counter {
    private String name;
    static int count;

    public Counter(String name) {
        this.name = name;
        count++;
    }


    public static void howMuch(){
        System.out.println("Класс Counter создан " + count + " раз(a)");
    }
}
