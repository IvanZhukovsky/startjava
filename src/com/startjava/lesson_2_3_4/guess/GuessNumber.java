package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
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
        Scanner scanner = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Внимание, у каждого игрока есть только 10 попыток!");

        for (int i = 0; i < 10; i++) {
            System.out.print(player1.getName() + " назовите число:");
            player1.setNumber(i, scanner.nextInt());
            player1.setCount(i + 1);
            if (checkNum(player1, i)) {
                break;
            }
            System.out.print(player2.getName() + " назовите число:");
            player2.setNumber(i, scanner.nextInt());
            player2.setCount(i + 1);
            if (checkNum(player2, i)) {
                break;
            }
        }
        showEnteredNumbers(player1);
        showEnteredNumbers(player2);
    }

    private boolean checkNum(Player player, int currentIndex) {
        if (player.getNumber(currentIndex) > targetNumber) {
            System.out.printf("число %s больше того, что загадал компьютер%n", player.getNumber(currentIndex));
        } else if (player.getNumber(currentIndex) < targetNumber) {
            System.out.printf("число %s меньше того, что загадал компьютер%n", player.getNumber(currentIndex));
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
        int enteredNumbers[] = Arrays.copyOf(player.getNumbers(), player.getCount());
        for (int number : enteredNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}