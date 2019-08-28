package ru.mingazov.task24;

import java.util.HashSet;
import java.util.Set;

public class ListRemove {

    public static Set<String> evenLength(Set<String> set){
        Set<String> newSet = new HashSet<>();
        for(String s : set ){
            if(s.length() % 2 == 0){
                newSet.add(s);
            }
        }
        return newSet;
    }
}
