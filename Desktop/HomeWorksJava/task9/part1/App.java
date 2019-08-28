package ru.mingazov.task9.part1;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Китикет");
        cat.setName();
        cat.eat();

        Duck duck = new Duck("Уточка");
        duck.setName();

        Frog frog = new Frog("Фрог");
        frog.setName();

        frog.getName();
        duck.getName();
        cat.getName();

    }
}
