package ru.mingazov.task19;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class checkCreator {


    public static void create(String filename) {
        try (FileReader fr = new FileReader(filename);
             Scanner scanner = new Scanner(fr)


        ) {
            PrintWriter writer = new PrintWriter(new FileOutputStream(filename + "Check.txt"));
            writer.write("Наименование           Цена      Кол-Во         Стоимость" + '\n');
            writer.write("=========================================================" + '\n');
            scanner.useLocale(Locale.ENGLISH);
            float result = 0;
            while (scanner.hasNext()) {
                float price;
                float value;
                float sum;
                String s;
                if (scanner.hasNextFloat()) {
                    value = scanner.nextFloat();
                    if (scanner.hasNextFloat()) {
                        price = scanner.nextFloat();
                        sum = value * price;

                        writer.printf("%7.2f   x", price);
                        writer.printf("%8.3f", value);

                        DecimalFormat df = new DecimalFormat("=####.##");
                        writer.printf("%18s%n",df.format(sum));
                        result += sum;
                    } else if (scanner.hasNextInt()) {
                        price = (float) scanner.nextInt();
                        sum = value * price;

                        writer.printf("%7.2f   x", price);
                        writer.printf("%8.3f", value);

                        DecimalFormat df = new DecimalFormat("=####.##");
                        writer.printf("%18s%n",df.format(sum));
                        result += sum;
                    }
                } else {
                    s = scanner.next();
                    if (scanner.hasNextLine()) {
                        String s1 = scanner.nextLine();
                        writer.printf("%-20s", s + s1);
                    } else {
                        writer.printf("%-20s", s);
                        break;
                    }
                }
            }
            writer.write("=========================================================" + '\n');
            writer.write("Итого:                                         =" + result + '\n');
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла какая-то ошибочка");
        }
        System.out.println("Создан чек по файлу " + filename);
    }
    
}
