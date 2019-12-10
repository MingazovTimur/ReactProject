package ru.mingazov.task4;

public class Animal {
    private int livingSpace;         //Необходимое пространство для жизни животного в литрах

    public void eatFood() {
        System.out.println("Ням");
    }

    /*
    protected int die(Animal animal) {
        System.out.println(":(");
        return Aquarium.volume = Aquarium.volume + Animal.livingSpace;
    }
     */

    public int getLivingSpace() {
        return livingSpace;
    }

    public void setLivingSpace(int livingSpace) {
        this.livingSpace = livingSpace;
    }

    @Override
    public String toString() {
        return "Animal{}";
    }
}
