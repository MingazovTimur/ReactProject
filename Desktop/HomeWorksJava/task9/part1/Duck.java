package ru.mingazov.task9.part1;

public class Duck extends Animal implements CanRun, CanSwim, Flyeble {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void setName() {
        System.out.println("Уточка");
    }

    @Override
    public void run() {
        System.out.println("Бегаю не очень быстро");
    }

    @Override
    public void runFast() {

    }

    @Override
    public void runSlow() {

    }

    @Override
    public void swim() {
        System.out.println("Умею плавать");

    }

    @Override
    public void swimFast() {

    }

    @Override
    public void swimSlow() {

    }

    @Override
    public void fly() {
        System.out.println("Умею летать");
    }
}
