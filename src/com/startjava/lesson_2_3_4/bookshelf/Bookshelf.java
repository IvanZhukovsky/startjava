package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    int quantity;
    Book[] books = new Book[10];
    int len = books.length;

    public Bookshelf() {
        books[0] = new Book("А.С. Пушкин", "Капитанская дочка", "1841");
        books[1] = new Book("А.С. Пушкин", "Евгений онегин", "1833");
        books[2] = new Book("Жюль Верн", "Таинственный остров", "1875");
        books[3] = new Book("Жюль Верн", "Дети капитана гранта", "1867");
        books[4] = new Book("А.П. Чехов", "Каштанка", "1887");
    }

    public void add(String author, String title, String publishYear) {
        if (getFreeSpace() == 0) {
            System.out.println("Полка заполнена, освободите место");
        } else {
            books[getQuantity()] = new Book(author, title, publishYear);
            System.out.println("Книга успешно добавлена на полку");
        }
    }

    public void delete(String title) {
        boolean isDeleted = false;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                books[i] = null;
                isDeleted = true;
                index = i;
            }
        }
        if (isDeleted) {
            System.arraycopy(books, index + 1, books, index, len - index - 1);
            System.out.println("Книга успешно удалена!");
        } else {
            System.out.println("Удаление не удалось, книга не найдена!");
        }
    }

    public String find(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equals(title)) {
                return book.getAuthor() + " " + book.getTitle() + " " + book.getPublishYear();
            }
        }
        return "Книга не найдена";
    }

    public int getQuantity() {
        return books.length - getFreeSpace();
    }

    public int getFreeSpace() {
        int count = 0;
        for (Book book : books) {
            if (book == null) {
                count++;
            }
        }
        return count;
    }

    public Book[] getBooks() {
        return Arrays.copyOf(books, books.length);
    }
}
