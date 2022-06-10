package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Начинаем, победитель будет установлен по результатам трех игр!");
        String option;
        Scanner scanner = new Scanner(System.in);
        //Создаем игроков и назначаем им имена
        System.out.print("Введите имя первого игрока:");
        Player player1 = new Player(scanner.next());
        System.out.print("Введите имя второго игрока:");
        Player player2 = new Player(scanner.next());
        System.out.print("Введите имя третьего игрока:");
        Player player3 = new Player(scanner.next());
        Player[] players = {player1, player2, player3};

        GuessNumber game;
        do {
            for (int round = 1; round < 4; round++) {
                System.out.println(round + " игра");
                //Бросаем жребий при помощи двух кубиков и определяем очередность хода игроков
                bubbleSort(players, castLots(players));
                game = new GuessNumber(players);
                game.start();
            }
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
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = scanner.next();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (!option.equals("no"));
        System.out.println("У игрока " + players[0].getName() + " " + players[0].getVictories() + " побед");
        System.out.println("У игрока " + players[1].getName() + " " + players[1].getVictories() + " побед");
        System.out.println("У игрока " + players[2].getName() + " " + players[2].getVictories() + " побед");
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
    //В методе массив с результатами броска кубиков сортируется по убыванию, зеркально с ним
    //сортируются игроки, после работы метода массив players будет содержать игроков расположенных
    //в нем в порядке очередности игры
    private static void bubbleSort(Player[] players, int[] lotResults) {
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
    //Вспомогательный метод, меняет местами ячейки массива для его сортировки
    private static void toSwap(int first, int second, int[] lotResults, Player[] players) {
        int buffer = lotResults[first];
        Player bufferPlayer = players[first];
        lotResults[first] = lotResults[second];
        players[first] = players[second];
        lotResults[second] = buffer;
        players[second] = bufferPlayer;
    }

}