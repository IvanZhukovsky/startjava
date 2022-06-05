package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private char sign;
    private int number1;
    private int number2;

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            case '/':
                return number1 / number2;
            case '^':
                return (int) Math.pow(number1, number2);
            case '%':
                return number1 % number2;
        }
        return 0;
    }
}