package ru.mingazov.task9.part1;


public class Cat extends Animal implements CanRun, CanSwim{


    public Cat(String name) {
        super(name);
    }

    @Override
    public void setName() {
        System.out.println("Кот");
    }


    @Override
    public void run() {
        System.out.println("Отлично умею бегать");
    }

    @Override
    public void runFast() {

    }

    @Override
    public void runSlow() {

    }


    @Override
    public void swim() {
        System.out.println("Плаваю с неохотой");


    }

    @Override
    public void swimFast() {

    }

    @Override
    public void swimSlow() {

    }
}
