package ru.mingazov.task9.part2;

public class Swimmer extends Human {

    @Override
    public void weight() {
        System.out.println("Вешу как пловец");
    }

    @Override
    public void run() {
        System.out.println("Бегу");
    }

    @Override
    public void runFast() {
        System.out.println("Бегу быстро");
    }

    @Override
    public void runSlow() {
        System.out.println("Бегу медленно");
    }

    @Override
    public void swim() {
        System.out.println("Плаваю, как профи");
    }

    @Override
    public void swimFast() {
        System.out.println("Плаваю очень быстро, я же пловец");
    }

    @Override
    public void swimSlow() {
        System.out.println("Плаваю медленно - разминаюсь");
    }


}
