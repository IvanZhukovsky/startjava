package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();
        String option;

        do {
            System.out.println("Введите математическое выражение в формате a знак операции b: ");
            Scanner scanner = new Scanner(System.in);
            calculator.setExpression(scanner.nextLine());
            System.out.println(calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.next();
            } while (!option.equals("no") && !option.equals("yes"));
        } while (!option.equals("no"));
    }
}