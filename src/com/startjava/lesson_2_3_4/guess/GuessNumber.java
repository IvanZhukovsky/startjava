package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player[] players;
    private int targetNumber;
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        this.players = players;
    }

    public void start() {
        for (int round = 1; round < 4; round++) {
            System.out.println(round + " игра");
            initGame();
            //Бросаем жребий при помощи двух кубиков и определяем очередность хода игроков
            rangeLots();
            //Проводим один раунд игры
            playRound();
            //Выводим результаты
            showEnteredNumbers(players);
        }
        determineWinner();
    }

    private void initGame() {
        //Загадываем число
        targetNumber = (int) (Math.random() * 100) + 1;
        //производим очистку игровых данных
        for (Player player : players) {
            player.clear();
        }
    }

    //Метод отвечает за бросок жребия
    private void rangeLots() {
        int len = players.length;
        int[] lotResults = {0, 1, 2};
        int lot = 0;
        int buffer = 0;
        for (int i = 0; i < len - 1; i++) {
            lot = (int) (Math.random() * (2 - i));
            buffer = lotResults[len - 1 - i];
            lotResults[len - 1 - i] = lotResults[lot];
            lotResults[lot] = buffer;
        }
        for (int i : lotResults) {
            System.out.println("Выпало " + i);
        }
        //На выходе получаем массив с результатами жребия
        sortPlayers(lotResults);
    }

    private void sortPlayers( int[] lotResults) {
        int len = players.length;
        Player[] src = Arrays.copyOf(players, len);
        for (int i = 0; i < len; i++) {
            players[lotResults[i]] = src[i];
        }
        System.out.println("Очередность игроков следующая");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    //Проводим один раунд игры
    private void playRound() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < players.length; j++) {
                System.out.print(players[j].getName() + " назовите число:");
                if (players[j].addNumber(scanner.nextInt())) {
                        if (compareNumbers(players[j])) {
                            i = 10;
                            break;
                        }
                } else {
                    System.out.println("Введенное число должно быть в диапазоне (0 , 100], ход переходит к другому игроку");
                }
            }
        }
    }

    private boolean compareNumbers(Player player) {
        int number = player.getNumber();
        int currentIndex = player.getCount() - 1;

        if (targetNumber == number) {
            System.out.printf("Игрок %s угадал число %s c %s попытки! %n",
                    player.getName(), targetNumber, (currentIndex + 1));
            player.addVictory();
            return true;
        }
        System.out.println("число " + number + (targetNumber < number ? " больше" : " меньше")
                + " того, что загадал компьютер");
        if (currentIndex == 9) {
            System.out.println("У игрока " + number + " закончились попытки!");
        }
        return false;
    }

    private void showEnteredNumbers(Player[] players) {
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " называл следующие числа:");
            for (int num : player.getNumbers()) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    //Метод для выявления победителя
    private void determineWinner() {
        //Проверяем на ничью
        int victoryIndex = 0;
        if (players[0].getVictories() == players[1].getVictories()
                && players[1].getVictories() == players[2].getVictories()) {
            System.out.println("По результатам трех игр ничья!");
        } else {
            //Определяем победителя
            int maxNumber = players[0].getVictories();

            for (int i = 0; i < players.length; i++) {
                if (players[i].getVictories() > maxNumber) {
                    maxNumber = players[i].getVictories();
                    victoryIndex = i;
                }
            }
        }
        System.out.println("По результатам трех игр победил: " + players[victoryIndex].getName() + "!");
    }
}
