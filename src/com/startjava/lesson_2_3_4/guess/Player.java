package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] numbers = new int[10];
    private int count;

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

    public void addNumber(int number) {
        numbers[count] = number;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void clear() {
        Arrays.fill(numbers, 0, count, 0);
        setCount(0);
    }
}