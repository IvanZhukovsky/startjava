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
        Scanner scanner = new Scanner(System.in);
        targetNumber = (int) (Math.random() * 100) + 1;
        
        while (true) {
            System.out.print(player1.getName() + " назовите число:");
            player1.setNumber(scanner.nextInt());
            if (targetNumber < player1.getNumber()) {
                System.out.printf("число %s больше того, что загадал компьютер%n", player1.getNumber());
            } else if (targetNumber > player1.getNumber()) {
                System.out.printf("число %s меньше того, что загадал компьютер%n", player1.getNumber());
            } else {
                System.out.println(player1.getName() + " вы победили!");
                break;
            }

            System.out.print(player2.getName() + " назовите число:");
            player2.setNumber(scanner.nextInt());
            if (targetNumber < player2.getNumber()) {
                System.out.printf("число %s больше того, что загадал компьютер%n", player2.getNumber());
            } else if (targetNumber > player2.getNumber()) {
                System.out.printf("число %s меньше того, что загадал компьютер%n", player2.getNumber());
            } else {
                System.out.println(player2.getName() + " вы победили!");
                break;
            }
        }
    }
}