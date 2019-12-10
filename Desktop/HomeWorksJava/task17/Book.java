package ru.mingazov.task17;

import java.io.Serializable;
import java.util.Arrays;

public class Book implements Serializable {

    private static final long serialVersionUID = 392L;

    private String  name;
    private String autor;
    private String  date;


    public Book(String name, String autor, String date) {
        this.name = name;
        this.autor = autor;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  '\n' +
                "Название произведения '" + name + '\'' +
                ", Автор '" + autor + '\'' +
                ", Год выпуска '" + date + '\'' + '\n'
                ;
    }
}
