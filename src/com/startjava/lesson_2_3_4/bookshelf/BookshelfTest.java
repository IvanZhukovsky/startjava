package com.startjava.lesson_2_3_4.bookshelf;

import java.util.Scanner;

public class BookshelfTest {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Scanner scanner = new Scanner(System.in);
        String answer;
        String[] answerElem;

        do {
            showUi(bookshelf);
            System.out.println("\nВведите команду -> ");
            answer = scanner.nextLine();
            answerElem = splitAnswer(answer);

            switch (answerElem[0]) {
                case ("add"):
                    if (answerElem.length == 4) {
                        bookshelf.add(answerElem[1], answerElem[2], answerElem[3]);
                    } else {
                        System.out.println("Книга не добавлена, неверный ввод данных");
                    }
                    break;
                case ("delete"):
                    if (answerElem.length == 2) {
                        bookshelf.delete(answerElem[1]);
                    } else {
                        System.out.println("Книга не удалена, неверный ввод данных");
                    }
                    break;
                case ("find"):
                    if (answerElem.length == 2) {
                        Book book = bookshelf.find(answerElem[1]);
                        System.out.println(book.getAuthor() + " " + book.getTitle() + " " + book.getPublishYear());
                    } else {
                        System.out.println("Книга не найдена, неверный ввод данных");
                    }
                    break;
                case ("how many books"):
                    System.out.println("На книжной полке книг - " + bookshelf.getSize() + " шт");
                    break;
                case ("how much space"):
                    System.out.println("На книжной полке свободных мест " + bookshelf.getFreeSpace());
                    break;
            }
        } while (!answer.equals("quit"));
    }

    private static void showUi(Bookshelf bookshelf) {
        System.out.printf("%-9s %-1s %9s %n", "<", "---------- МЕНЮ ----------", ">");
        System.out.printf("%-2s %-41s %s %n", "<", "1. add <author> <title> <publishYear>", ">");
        System.out.printf("%-2s %-41s %s %n", "<", "2. delete <title>", ">");
        System.out.printf("%-2s %-41s %s %n", "<", "3. find <title>", ">");
        System.out.printf("%-2s %-41s %s %n", "<", "4. how many books", ">");
        System.out.printf("%-2s %-41s %s %n", "<", "5. how much space", ">");
        System.out.printf("%-2s %-41s %s %n%n", "<", "6. quit", ">");

        System.out.printf("%-9s %-1s %10s %n", "<", "----- КНИЖНАЯ ПОЛКА -----", ">");
        for (Book book : bookshelf.getBooks()) {
            if (book != null) {
                System.out.printf("%-2s %-12s %-22s %-3s %2s %n", "<", book.getAuthor(),
                        book.getTitle(), book.getPublishYear(), ">");
            } else System.out.printf("%-4s %-1s %4s %n", "<", "----------книга отсутствует----------", ">");
        }
    }

    private static String[] splitAnswer(String answer) {
        String answerElem[] = answer.split(" <");
        for (int i = 1; i < answerElem.length; i++) {
            answerElem[i] = answerElem[i].substring(0, answerElem[i].length() - 1);
        }
        return answerElem;
    }

}
