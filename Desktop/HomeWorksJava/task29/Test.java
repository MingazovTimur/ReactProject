package ru.mingazov.task29;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>(HashMapApp.createMap());
        System.out.println(map);

        HashMapApp.removeTheDuplicates(map);
        System.out.println(map);
    }
}
