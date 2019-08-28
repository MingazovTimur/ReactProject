package ru.mingazov.task19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App {
  public static void main(String[] args) {
     /*   try(Writer writer = new OutputStreamWriter(new FileOutputStream("products.txt"))) {
            writer.write("Колбаса Вареная" + '\n');
            writer.write("199.9" + '\n');
            writer.write("0.4" + '\n');

            writer.write("Кокакола" + '\n');
            writer.write("99.9" + '\n');
            writer.write("1.5" + '\n');

            writer.write("Эчпочмак" + '\n');
            writer.write("329.9" + '\n');
            writer.write("0.3" + '\n');

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        checkCreator.create("products.txt");

    }
}