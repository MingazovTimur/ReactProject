package ru.mingazov.task9.part2;

public class Runner extends Human{
    @Override
    public void weight() {
        System.out.println("Вешу как бегун");
    }

    @Override
    public void run() {
        System.out.println("Бегаю");
    }

    @Override
    public void runFast() {
        System.out.println("Бегу очень очень быстро");
    }

    @Override
    public void runSlow() {
        System.out.println("Бегу медленно - так могу очень долго");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю");
    }

    @Override
    public void swimFast() {

    }

    @Override
    public void swimSlow() {

    }
}
