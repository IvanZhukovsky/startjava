package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int size;
    private Book[] books = new Book[10];

    public Bookshelf() {
        books[0] = new Book("А.С. Пушкин", "Капитанская дочка", "1841");
        books[1] = new Book("А.С. Пушкин", "Евгений онегин", "1833");
        books[2] = new Book("Жюль Верн", "Таинственный остров", "1875");
        books[3] = new Book("Жюль Верн", "Дети капитана гранта", "1867");
        books[4] = new Book("А.П. Чехов", "Каштанка", "1887");
        size = 5;
    }

    public void add(String author, String title, String publishYear) {
        if (getFreeSpace() == 0) {
            System.out.println("Полка заполнена, освободите место");
        } else {
            books[size] = new Book(author, title, publishYear);
            System.out.println("Книга успешно добавлена на полку");
            size++;
        }
    }

    public void delete(String title) {
        int index = findIndex(title);
        if (index != -1) {
            //books[index] = null;
            size--;
            System.arraycopy(books, index + 1, books, index, size - index);
            books[size] = null;
            System.out.println("Книга успешно удалена!");
        } else {
            System.out.println("Удаление не удалось, книга не найдена!");
        }
    }

    public Book find(String title) {
        int index = findIndex(title);
        if (index != -1) {
            return books[index];
        }
        return null;
    }

    private int findIndex(String title) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public int getSize() {
        return size;
    }

    public int getFreeSpace() {
        return books.length - size;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }
}
