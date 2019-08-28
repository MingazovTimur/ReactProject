package ru.mingazov.task15.part1;

import ru.mingazov.task15.part1.FileChanger;

public class Test {
    public static void main(String[] args) {
        FileChanger.createNewFile("test.txt");
        FileChanger.copyFile("test.txt", "copyTest.txt");
        FileChanger.renameFile("copyTest.txt", "newTest.txt");
        FileChanger.deleteFile("test.txt");

    }
}
