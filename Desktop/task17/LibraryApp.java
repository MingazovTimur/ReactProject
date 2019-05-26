package ru.mingazov.task17;



import java.io.*;
import java.util.Arrays;

import static ru.mingazov.task17.Library.*;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = loadLibrary();


        Book book1  = new Book("Поток", "Михай Чиксентмихайи", "1990г");
        library.addBook(book1);
        Book book2  = new Book("Человек, который был четвергом", "Гилберт Кит Честертон", "1908г");
        library.addBook(book2);
        Book book3  = new Book("Тим Талер", "Джеймс Крюс", "1962г");
        library.addBook(book3);

        //saveBooks();



    }



    private static final String libraryName = "Library.bin";

    public static Library loadLibrary() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(libraryName)))
        {
            System.out.println(ois.readObject());

        } catch (FileNotFoundException e) {
            System.out.println("Библиотека ещё не создана");
        } catch (EOFException eof) {
            System.out.println("eof");
        } catch (IOException e) {
            System.out.println("Произошла ошибка");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new Library();
    }




    static void saveBooks(){
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(libraryName)
        )) {
                String a = Arrays.toString(books);
                oos.writeObject(a);
            System.out.println("Все книги записанные в библиотеку сохранены");
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
