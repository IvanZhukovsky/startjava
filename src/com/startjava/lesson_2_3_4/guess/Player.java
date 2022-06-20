package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count;
    private int victories;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, count);
    }

    public int getNumber() {
        return numbers[count - 1];
    }

    public boolean addNumber(int number) {
        numbers[count] = number;
        count++;
        if (number > 0 && number <= 100) {
            return true;
        }
        return false;
    }

    public int getCount() {
        return count;
    }

    public int getVictories() {
        return victories;
    }

    public void addVictory() {
        victories++;
    }

    public void clear() {
        Arrays.fill(numbers, 0, count, 0);
        count = 0;
    }
}