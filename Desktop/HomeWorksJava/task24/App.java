package ru.mingazov.task24;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> test = new HashSet<>();
        test.add("one");
        test.add("two");
        test.add("three");
        test.add("four");
        test.add("fife");
        test.add("six");
        test.add("seven");
        test.add("123");
        test.add("12");
        test.add("good");
        test.add("bad");
        System.out.println(test);


        System.out.println(ListRemove.evenLength(test));

    }
}
