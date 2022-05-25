public class Calculator {
    
        private char sign;
        private int number1;
        private int number2;
        private int result;

        public void setSign(char sign) {
            this.sign = sign;
        }

        public void setNumber1(int number1) {
            this.number1 = number1;
        }

        public void setNumber2(int number2) {
            this.number2 = number2;
        }

        public int getResult() {
            switch (sign) {
                case ('+'):
                    result = number1 + number2;
                    break;
                case ('-'):
                    result = number1 - number2;
                    break;
                case ('*'):
                    result = number1 * number2;
                    break;
                case ('/'):
                    result = number1 / number2;
                    break;
                case ('^'):
                    result = number1;
                    for (int i = 1; i < number2; i++) {
                        result = result * number1;
                    }
                    break;
                case ('%'):
                    result = number1 % number2;
                    break;
            }
            return result;
        }
}
