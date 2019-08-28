package ru.mingazov.task8.dogovorAndAct;

import java.util.Arrays;

public class Dogovor {
    private int number;
    private String date;
    private String[] list = new String[3];

    /*
    public static Dogovor(int number, String date, String[] list) {
        this.number = number;
        this.date = date;
        this.list = list;

     */


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Договор "  +
                "под номером: " + number +
                " с датой произодства: "  + date + '\'' +
                " содержит информацию о: "  + Arrays.toString(list);
    }
}
