package ru.mingazov.task15.part2;

import java.io.File;

public class Recursive {
    public static void main(String[] args) {
        File dir = new File("/Applications/uchebaJava");
        System.out.println(dir.isDirectory());
        check(dir);

    }


   static public void check(File dir) {
       File[] files = dir.listFiles();
       for (File file:files) {
           if(file.isFile()){
               System.out.println(file.getName());
           } else {
               check(file);
           }
       }

    }

}