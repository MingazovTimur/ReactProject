package ru.mingazov.task9.part2;

public class Child extends Human {
    @Override
    public void weight() {
        System.out.println("Вешу совсем немного, ведь ещё ребёнок");
    }

    @Override
    public void run() {
        System.out.println("Бегаю ещё неуклюже");
    }

    @Override
    public void runFast() {

    }

    @Override
    public void runSlow() {

    }

    @Override
    public void swim() {
        System.out.println("Ещё пока не умею");
    }

    @Override
    public void swimFast() {

    }

    @Override
    public void swimSlow() {

    }
}
