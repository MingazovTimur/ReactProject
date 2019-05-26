package ru.mingazov.task17;

import java.io.Serializable;

public class Library implements Serializable {
    static Book [] books = new Book[5];

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book){
        Book[] newBooks = new Book[books.length + 1];
        System.arraycopy(books, 0, newBooks, 0, books.length);
        newBooks[books.length] = book;
        books = newBooks;
        System.out.println(book + "Добавлена в массив, для сохранения используйте saveBooks");
    }

    public void bookList (){
        System.out.println("В массиве библиотеки сейчас: ");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
