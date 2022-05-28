public class Calculator {
    
    private char sign;
    private int number1;
    private int number2;

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int calculate() {
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
                int result = number1;
                for (int i = 1; i < number2; i++) {
                    result *= number1;
                }
                return result;
            case '%':
                return number1 % number2;
        }
        return 0;
    }
}