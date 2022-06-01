package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;
import com.startjava.lesson_2_3.calculator.Calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String option;

        do {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            System.out.println(calculator.calculate());
            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.next();
            } while (!option.equals("no") && !option.equals("yes"));
        } while (!option.equals("no"));
    }
}