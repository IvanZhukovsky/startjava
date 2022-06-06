package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите математическое выражение в формате a знак операции b: ");
            System.out.println("Результат вычислений равен " + Calculator.calculate(scanner.nextLine()));
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.nextLine();
            } while (!option.equals("no") && !option.equals("yes"));
        } while (!option.equals("no"));
    }
}