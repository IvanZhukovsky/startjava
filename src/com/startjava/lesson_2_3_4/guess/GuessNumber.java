package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private int targetNumber;
    private int count1;
    private int count2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100) + 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(player1.getName() + " назовите число:");
            player1.setNumber(i, scanner.nextInt());
            count1 = i + 1;
            if (checkNum(player1, targetNumber, i)) {
                break;
            }
            System.out.print(player2.getName() + " назовите число:");
            player2.setNumber(i, scanner.nextInt());
            count2 = i + 1;
            if (checkNum(player2, targetNumber, i)) {
                break;
            }
        }
        showUsedNumbers(player1, count1);
        showUsedNumbers(player2, count2);
    }

    private void showUsedNumbers(Player player, int index) {
        System.out.println("Игрок " + player.getName() + " называл следующие числа:");
        int usedNumbers[] = Arrays.copyOf(player.getNumbers(), index);
        for (int num : usedNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private boolean checkNum(Player player, int targetNumber, int currentIndex) {
        if (targetNumber < player.getNumber(currentIndex)) {
            System.out.printf("число %s больше того, что загадал компьютер%n", player.getNumber(currentIndex));
        } else if (targetNumber > player.getNumber(currentIndex)) {
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
}