import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            System.out.println(calculator.getResult());
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            if (scanner.next().equals("no")) {
                break;
            }
        }
    }
}