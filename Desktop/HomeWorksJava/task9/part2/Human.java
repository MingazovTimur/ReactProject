package ru.mingazov.task9.part2;

import ru.mingazov.task9.part1.CanRun;
import ru.mingazov.task9.part1.CanSwim;

public abstract class Human implements CanRun, CanSwim {
    public void getName(){
        System.out.println("Имя неизвестно");
    }

    public abstract void weight();
}
