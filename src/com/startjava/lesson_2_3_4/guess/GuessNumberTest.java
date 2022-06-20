package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        System.out.println("Начинаем, победитель будет установлен по результатам трех игр!");
        String option;
        Scanner scanner = new Scanner(System.in);
        Player[] players = createPlayers(scanner);
        GuessNumber game;
        do {
            game = new GuessNumber(players);
            game.start();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]:");
                option = scanner.next();
            } while (!option.equals("yes") && !option.equals("no"));
        } while (!option.equals("no"));
    }

    public static Player[] createPlayers(Scanner scanner) {
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя " + (i + 1) + "-го игрока:");
            players[i] = new Player(scanner.next());
        }
        return players;
    }
}