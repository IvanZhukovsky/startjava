package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int targetNumber;

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        //Загадываем число
        targetNumber = (int) (Math.random() * 100) + 1;
        //производим очистку игровых данных
        for (Player player: players) {
            player.clear();
        }
        //Проводим один раунд игры
        System.out.println("Внимание, у каждого игрока есть только 10 попыток!");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < players.length; j++) {
                System.out.print(players[j].getName() + " назовите число:");
                players[j].addNumber(scanner.nextInt());
                if (players[j].getNumber() != 0) {
                    if (compareNumbers(players[j], targetNumber)) {
                        i = 10;
                        break;
                    }
                }
            }
        }
        //Выводим результаты
        for (Player player : players) {
            showEnteredNumbers(player);
        }
    }

    private void showEnteredNumbers(Player player) {
        System.out.println("Игрок " + player.getName() + " называл следующие числа:");
        for (int num : player.getNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private boolean compareNumbers(Player player, int targetNumber) {
        int number = player.getNumber();
        int currentIndex = player.getCount() - 1;

        if (targetNumber == number) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber +
                    " с " + (currentIndex + 1) + " попытки!");
            player.addVictory();
            return true;
        } else {
            System.out.println("число " + number +
                    (targetNumber < number ? " больше" : " меньше") +
                    " того, что загадал компьютер");
        }
        if (currentIndex == 9) {
            System.out.println("У игрока " + number + " закончились попытки!");
        }
        return false;
    }
}
