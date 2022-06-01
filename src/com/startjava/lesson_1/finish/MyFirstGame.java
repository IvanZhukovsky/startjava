package com.startjava.lesson_1.finish;

public class MyFirstGame {
    public static void main(String[] args) {
        int targetNumber = 75;
        int playerNumber = 0;

        while (targetNumber != playerNumber) {
            playerNumber = (int) (Math.random() * 100);
            if (targetNumber < playerNumber) {
                System.out.printf("число %s больше того, что загадал компьютер%n", playerNumber);
            } else if (targetNumber > playerNumber) {
                System.out.printf("число %s меньше того, что загадал компьютер%n", playerNumber);
            }
        }
        System.out.println("Вы победили!");
    }
}