package ru.mingazov.task8.dogovorAndAct;

public class Test {
    public static void main(String[] args) {

        Dogovor dogovor = new Dogovor();
        dogovor.setDate("21.04.2019");
        dogovor.setList(new String[] {"Производстве","Зарплатах", "Котятах"});
        dogovor.setNumber(212);

        Act act = Refactor.convert(dogovor);
        System.out.println(act);
    }
}
