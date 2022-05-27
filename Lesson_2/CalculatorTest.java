import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String choose;

        while (true) {
            System.out.print("Введите первое число: ");
            calculator.setNumber1(scanner.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(scanner.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNumber2(scanner.nextInt());
            System.out.println(calculator.calculate());
            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                choose = scanner.next();
                if (choose.equals("no") || choose.equals("yes")) {
                    break;
                }
            }
            if (choose.equals("no")) {
                break;
            }
        }
    }
}