package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private char sign;
    private int number1;
    private int number2;
    private String expression;

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int calculate() {
        setNumbers(expression);
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

    private void setNumbers(String expression) {
        String[] elements = expression.split(" ");
        number1 = Integer.parseInt(elements[0]);
        number2 = Integer.parseInt(elements[2]);
        sign = elements[1].charAt(0);
    }
}