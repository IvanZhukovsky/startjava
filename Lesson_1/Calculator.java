public class Calculator {
    public static void main(String[] args) {
        char sign = '%';
        int number1 = 10;
        int number2 = 3;
        int result = 0;

        if (sign == '+') {
            result = number1 + number2;
        } else if (sign == '-') {
            result = number1 - number2;
        } else if (sign == '*') {
            result = number1 * number2;
        } else if (sign == '/') {
            result = number1 / number2;
        } else if (sign == '^') {
            result = number1;
            for (int i = 1; i < number2; i++) {
                result = result * number1;
            }
        } else if (sign == '%') {
            result = number1 % number2;
        }
        System.out.println(number1 + " " + sign + " " + number2 + " = " + result);
    }
}
