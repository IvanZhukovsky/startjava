package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class Calculator {
    public static int calculate(String expression) {
        char sign = '*';
        double number1;
        double number2;
        Scanner scanner = new Scanner(System.in);
         while (true) {
            String[] elements = expression.split(" ");
            try {
                number1 = Double.parseDouble(elements[0]);
                number2 = Double.parseDouble(elements[2]);
                sign = elements[1].charAt(0);
            } catch (NumberFormatException e) {
                System.out.println("некорректный ввод, если хотите начните заново");
                number1 = 0;
                number2 = 0;
            }
            if (number1 < 0 || number2 < 0 || number1 % 1 != 0 || number2 % 1 != 0) {
                System.out.println("Некорректный ввод, введите целое положительное число");
                expression = scanner.nextLine();
            } else break;
        }
        double result = 0;
        try {
            result = switch (sign) {
                case '+' -> number1 + number2;
                case '-' -> number1 - number2;
                case '*' -> number1 * number2;
                case '/' -> number1 / number2;
                case '^' -> (int) Math.pow(number1, number2);
                case '%' -> number1 % number2;
                default -> throw new IllegalStateException("Unexpected value: " + sign);
            };
        } catch (IllegalStateException e) {
            System.out.println("некорректный ввод, если хотите начните заново");
        }
        return (int) result;
    }
}