package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();
        String option;

        do {
            System.out.println("Введите математическое выражение в формате a знак операции b: ");
            Scanner scanner = new Scanner(System.in);
            String[] elements = scanner.nextLine().split(" ");
            calculator.setNumber1(Integer.parseInt(elements[0]));
            calculator.setNumber2(Integer.parseInt(elements[2]));
            calculator.setSign(elements[1].charAt(0));
            System.out.println(calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.next();
            } while (!option.equals("no") && !option.equals("yes"));
        } while (!option.equals("no"));
    }
}