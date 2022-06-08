package com.startjava.lesson_2_3_4.guess;

public class Player {
    private String name;
    private int[] numbers = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getNumber(int index) {
        return numbers[index];
    }

    public void setNumber(int index, int number) {
        this.numbers[index] = number;
    }
}