package ru.mingazov.task7;

import jdk.nashorn.internal.runtime.arrays.ArrayIndex;

import java.lang.reflect.Array;

public enum Drinks {
    TEA("Чай", 70, 1), WATER ("Водичка", 40, 2),
    COLA("Кока-Колка", 90, 3), FANTA("Фанта", 80, 4),
    COFFEE("Кофеёк", 100, 5), JUICE("Сок", 130, 6);


    Drinks(String name, int price, int button) {
        this.name = name;
        this.price = price;
        this.button = button;
    }

    private String name;
    private int price;
    private  int button;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getButton() {
        return button;
    }

    public void setButton(int button) {
        this.button = button;
    }


    public String toString() {
        return  "______________________________________________" + '\n' +
                "Клавиша " + button + "| Напиток - " + name +
                " Стоимость " + price + '\n';

    }
}
