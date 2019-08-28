package ru.mingazov.task9.part1;

public abstract class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void  setName();

    public void eat(){
        System.out.println("Ням");
    }

    public void getName(){
        System.out.println(this.name);
    }

}
