package ru.mingazov.task22;


import java.util.Comparator;


public class PersonComparator implements Comparator<Person> {


    public int compare(Person a, Person b) {

        if(a.getAge().compareTo(b.getAge()) == 0) {
            return a.compareTo(b);
        } else {
            return a.getAge().compareTo(b.getAge());
        }
    }

}
