package ru.mingazov.task9.part1;

public class Frog extends Animal implements CanSwim, CanRun{


    public Frog(String name) {
        super(name);
    }

    @Override
    public void setName() {
        System.out.println("Лягушка");
    }

    @Override
    public void run() {
        System.out.println("Бегаю не очень, в основном прыгаю");
    }

    @Override
    public void runFast() {

    }

    @Override
    public void runSlow() {

    }

    @Override
    public void swim() {
        System.out.println("Умею хорошо плавать");
    }

    @Override
    public void swimFast() {

    }

    @Override
    public void swimSlow() {

    }

    @Override
    public void getName() {
        super.getName();
    }
}
