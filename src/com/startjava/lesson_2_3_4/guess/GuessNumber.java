package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {

        targetNumber = (int) (Math.random() * 100) + 1;
        player1.clear();
        player2.clear();
        System.out.println("Внимание, у каждого игрока есть только 10 попыток!");

        for (int i = 0; i < 10; i++) {
            inputNumber(player1);
            if (compareNumbers(player1, i)) {
                break;
            }
            inputNumber(player2);
            if (compareNumbers(player2, i)) {
                break;
            }
        }
        showEnteredNumbers(player1);
        showEnteredNumbers(player2);
    }

    private boolean compareNumbers(Player player, int currentIndex) {
        int number = player.getNumber();
        if (number > targetNumber) {
            System.out.printf("число %s больше того, что загадал компьютер%n", number);
        } else if (number < targetNumber) {
            System.out.printf("число %s меньше того, что загадал компьютер%n", number);
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " с " + (currentIndex + 1) + " попытки!");
            return true;
        }
        if (currentIndex == 9) {
            System.out.println("У игрока " + player.getName() + " закончились попытки!");
        }
        return false;
    }

    private void showEnteredNumbers(Player player) {
        System.out.println("Игрок " + player.getName() + " называл следующие числа:");
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + " назовите число:");
        player.addNumber(scanner.nextInt());
    }
}