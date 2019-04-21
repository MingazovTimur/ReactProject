package ru.mingazov.task4;

import java.util.Arrays;

public class Aquarium {
    private int volume;  //Объем аквариума
    public Animal[] inside = new Animal[10];

    public Animal[] getInside() {
        return inside;
    }

    public void setInside(Animal[] inside) {
        this.inside = inside;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Внутри аквариума сейчас "
                + Arrays.toString(inside);
    }
}


