package ru.mingazov.task22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tommy", 17));
        personList.add(new Person("Jerry", 10));
        personList.add(new Person("Garry", 21));
        personList.add(new Person("Georgina", 19));
        personList.add(new Person("Georgriforius", 17));
        personList.add(new Person("Leonidus", 17));




        for (Person a:personList) {
            System.out.println(a);
        }

        Collections.sort(personList, new PersonComparator());

        System.out.println();
        System.out.println("Сортированный лист " + '\n');

        for (Person a:personList) {
            System.out.println(a);
        }

    }
}
