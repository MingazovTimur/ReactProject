package ru.mingazov.task25.part1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapUnique {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        System.out.println(isUnique(map));

        map.put("Петр", "Петров");
        map.put("Федя", "Федоров");
        map.put("Иван", "Иванов");

        System.out.println(isUnique(map));

        map.put("Игорь", "Иванов");
        map.put("Лёша", "Петров");

        System.out.println(isUnique(map));

    }






    static public boolean isUnique(Map<String, String> map) {
        boolean result = true;
        for (String s : map.values()) {
            if (Collections.frequency(map.values(), s) >= 2) {
                result = false;
            }
        }
        return result;
    }

}
