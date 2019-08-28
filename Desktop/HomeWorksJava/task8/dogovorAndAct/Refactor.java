package ru.mingazov.task8.dogovorAndAct;

public  class Refactor {

    /*static Act act = new Act();

    public static Act refactor(Dogovor dogovor) {
        act.setDate(dogovor.getDate());
        act.setNumber(dogovor.getNumber());
        act.setList(dogovor.getList());
        System.out.println("Новый акт сгенерирован из договора");
        System.out.println(dogovor);
        System.out.println("Новый акт");
        System.out.println(act);
        return act;
    }

     */

    public static Act convert(Dogovor dogovor){
        Act act = new Act();
        act.setDate(dogovor.getDate());
        act.setNumber(dogovor.getNumber());
        act.setList(dogovor.getList());
        System.out.println("Новый акт сгенерирован из договора");
        System.out.println(dogovor);
        System.out.println("Новый акт");
        System.out.println(act);
        return act;


    }


}
