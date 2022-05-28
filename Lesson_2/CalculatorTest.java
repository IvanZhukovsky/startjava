import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String option = "";

        while (!option.equals("no")) {
            option = "";
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            System.out.println(calculator.calculate());
            while (!option.equals("no") && !option.equals("yes")) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                option = scanner.next();
            }
        }
    }
}