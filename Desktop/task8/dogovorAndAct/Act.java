package ru.mingazov.task8.dogovorAndAct;

import java.util.Arrays;

public class Act {
    private int number;
    private String date;
    private String[] list;

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
        return "АКТ " +
                "с номером : " + number +
                " датой производства: " + date + '\'' +
                " содержит информации о: " + Arrays.toString(list);
    }
}
