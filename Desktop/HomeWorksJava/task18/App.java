package ru.mingazov.task18;

import java.io.*;

public class App {
    public static void main(String[] args) {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream("CopyDemo.txt"), "UTF-8")){
            writer.write("Тестирую копирование13");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Copy.difCode("CopyDemo.txt", "UTF-8",
                "CopyDemoWithWindows1251", "Windows-1251");

        Copy.difCode("CopyDemo.txt", "CopyDemoNew.txt", "das", "s");

    }
}
