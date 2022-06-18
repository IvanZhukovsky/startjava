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

        for (int round = 1; round < 4; round++) {
            System.out.println(round + " игра");
            initGame();
            //Бросаем жребий при помощи двух кубиков и определяем очередность хода игроков
            bubbleSort(players, castLots(players));
            //Проводим один раунд игры
            System.out.println("Внимание, у каждого игрока есть только 10 попыток!");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < players.length; j++) {
                    System.out.print(players[j].getName() + " назовите число:");

                    if (players[j].addNumber(scanner.nextInt())) {
                        if (players[j].getNumber() != 0) {
                            if (compareNumbers(players[j])) {
                                i = 10;
                                break;
                            }
                        }
                    } else {
                        System.out.println("Введенное число должно быть в диапазоне (0 , 100], ход переходит к другому игроку");
                    }
                }
            }
            //Выводим результаты
            showEnteredNumbers(players);
        }
        determineTheWinner();
    }

    private void initGame() {
        //Загадываем число
        targetNumber = (int) (Math.random() * 100) + 1;
        //производим очистку игровых данных
        for (Player player : players) {
            player.clear();
        }
    }

    private boolean compareNumbers(Player player) {
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

    private void showEnteredNumbers(Player[] players) {
        for (Player player : players) {
            System.out.println("Игрок " + player.getName() + " называл следующие числа:");
            for (int num : player.getNumbers()) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    //В методе массив с результатами броска кубиков сортируется по убыванию, зеркально с ним
    //сортируются игроки, после работы метода массив players будет содержать игроков расположенных
    //в нем в порядке очередности игры
    private void bubbleSort(Player[] players, int[] lotResults) {
        int len = lotResults.length;
        for (int i = len - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (lotResults[j] < lotResults[j + 1])
                    toSwap(j, j + 1, lotResults, players);
            }
        }
        for (int i : lotResults) {
            System.out.println(i);
        }
        System.out.println("Очередность игроков следующая");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }
    //Метод отвечает за имитацию броска кубиков игроками и выдает результаты бросков в виде баллов от 2 до 12
    private static int[] castLots(Player[] players) {
        int len = players.length;
        int[] lotResults = new int[len];
        int count;
        for (int i = 0; i < len; i++) {
            System.out.println("Жребий бросает " + players[i].getName());
            //Бросаем кубики до получения уникального результата (чтобы не было ничьи)
            do {
                lotResults[i] = (int) (Math.random() * 11) + 2;
                count = 0;
                for (int number : lotResults) {
                    if (lotResults[i] == number) {
                        count++;
                    }
                }
            } while (count != 1);
            System.out.println("Выпало " + lotResults[i]);
        }
        //На выходе получаем массив с результатами жребия
        return lotResults;
    }

    //Вспомогательный метод, меняет местами ячейки массива для его сортировки
    private void toSwap(int first, int second, int[] lotResults, Player[] players) {
        int buffer = lotResults[first];
        Player bufferPlayer = players[first];
        lotResults[first] = lotResults[second];
        players[first] = players[second];
        lotResults[second] = buffer;
        players[second] = bufferPlayer;
    }

    //Метод для выявления победителя
    private void determineTheWinner() {
        //Проверяем на ничью
        int victoryIndex = 0;
        if (players[0].getVictories() == players[1].getVictories()
                && players[1].getVictories() == players[2].getVictories()) {
            System.out.println("По результатам трех игр ничья!");
        } else {
            //Определеяем победителя
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
