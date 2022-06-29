package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int size;
    private Book[] books = new Book[10];
    private int cursor;

    public Bookshelf() {

        books[0] = new Book("А.С. Пушкин", "Капитанская дочка", "1841");
        books[1] = new Book("А.С. Пушкин", "Евгений онегин", "1833");
        books[2] = new Book("Жюль Верн", "Таинственный остров", "1875");
        books[3] = new Book("Жюль Верн", "Дети капитана гранта", "1867");
        books[4] = new Book("А.П. Чехов", "Каштанка", "1887");
        cursor = 5;
    }

    public void add(String author, String title, String publishYear) {
        if (getFreeSpace() == 0) {
            System.out.println("Полка заполнена, освободите место");
        } else {
            books[getSize()] = new Book(author, title, publishYear);
            System.out.println("Книга успешно добавлена на полку");
            cursor++;
        }
    }

    public void delete(String title) {
        int len = books.length;
        boolean isDeleted = false;
        int index = 0;
        for (int i = 0; i < cursor; i++) {
            if (books[i].getTitle().equals(title)) {
                books[i] = null;
                isDeleted = true;
                cursor--;
                index = i;
            }
        }

        if (isDeleted) {
            System.arraycopy(books, index + 1, books, index, cursor - index);
            books[cursor] = null;
            System.out.println("Книга успешно удалена!");
        } else {
            System.out.println("Удаление не удалось, книга не найдена!");
        }
    }

    public Book find(String title) {
        for (int i = 0; i < cursor; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public int getSize() {
        return cursor;
    }

    public int getFreeSpace() {
        return books.length - cursor;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }
}
