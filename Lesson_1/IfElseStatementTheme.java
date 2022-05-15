public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод пседокода на язык Java");
        int age = 40;
        boolean sexMan = false;
        double height = 1.76;
        char firstLetter = "Ivan".charAt(0);

        if (age > 20) {
            System.out.println("Возраст этого человека больше 20 лет");
        } else {
            System.out.println("Возраст этого человека меньше 20 лет");
        }
        if (!sexMan) {
            System.out.println("Пол этого человека женский");
        }
        if (height < 1.8) {
            System.out.println("Рост этого человека меньше 1.8 метра");
        } else {
            System.out.println("Рост этого человека больше 1.8 метра");
        }
        if (firstLetter == 'M') {
            System.out.println("Имя этого человека начинается с буквы M");
        } else if (firstLetter == 'I') {
            System.out.println("Имя этого человека начинается с буквы I");
        } else {
            System.out.println("Имя этого человека начинается не с буквы M и не с буквы I");
        }

        System.out.println("\n2. Поиск max и min числа");
        int number1 = 34;
        int number2 = 33;
        if (number1 > number2) {
            System.out.println("число 1 - max = " + number1);
            System.out.println("число 2 - min = " + number2);
        } else if (number1 < number2) {
            System.out.println("число 2 - max = " + number2);
            System.out.println("число 1 - min = " + number1);
        } else {
            System.out.println("числа равны");
        }

        System.out.println("\n3. Работа с числом");
        int number = -24;
        if (number == 0) {
            System.out.println("Число равно нулю");
        } else {
            if (number % 2 == 0) {
                System.out.println("Число четное");
            } else System.out.println("Число нечетное");
            if (number < 1) {
                System.out.println("Число отрицательное");
            } else System.out.println("Число положительное");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int numberN = 173;
        int numberM = 123;
        boolean similarX = false;
        boolean similarY = false;
        boolean similarZ = false;
        int digitA = 0;
        int digitB = 0;
        int digitC = 0;

        if (numberN / 100 == numberM / 100) {
            similarX = true;
            digitA = numberN / 100;
        }
        numberN = numberN % 100;
        numberM = numberM % 100;
        if (numberN / 10 == numberM / 10) {
            similarY = true;
            digitB = numberN / 10;
        }
        if (numberN % 10 == numberM % 10) {
            similarZ = true;
            digitC = numberN % 10;
        }
        if (!similarX && !similarY && !similarZ) {
            System.out.println("В числах N и M одинаковых цифр стоящих в одном и том же разряде нет");
        } else {
            System.out.print("в числах N и M одинаковые цифры ");
            if (similarX) {
                System.out.print(digitA);
            }
            if (similarY) {
                if (similarX) {
                    System.out.print(", " + digitB);
                } else System.out.print(digitB);
            }
            if (similarZ) {
                if (similarX || similarY) {
                    System.out.print(", " + digitC);
                } else System.out.print(digitC);
            }
            System.out.print(" стоят в ");
            if (similarX) {
                System.out.print("X");
            }
            if (similarY) {
                if (similarX) {
                    System.out.print(", " + "Y");
                } else System.out.print("Y");
            }
            if (similarZ) {
                if (similarX || similarY) {
                    System.out.print(", " + "Z");
                } else System.out.print("Z");
            }
            System.out.println(" разрядах");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char symbol = '\u0057';
        System.out.println(symbol);
        if ((int) symbol >= 65 && (int) symbol <= 90) {
            System.out.println("большая буква");
        } else if ((int) symbol >= 97 && (int) symbol <= 122) {
            System.out.println("маленькая буква");
        } else if ((int) symbol >= 48 && (int) symbol <= 57) {
            System.out.println("это число");
        } else System.out.println("не буква и не число");

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300_000;
        int annualInterestRate = 0;
        if (deposit < 100_000) {
            annualInterestRate = 5;
        }
        if (deposit >= 100_000 && deposit <= 300_000) {
            annualInterestRate = 7;
        }
        if (deposit > 300_000) {
            annualInterestRate = 10;
        }
        System.out.println("Сумма вклада составляет " + deposit + "у.е.");
        System.out.println("Начисленный % соcтавляет " + annualInterestRate + "% годовых или " + deposit * annualInterestRate / 100 + "у.е.");
        System.out.println("Итоговая сумма с % составляет " + (deposit + deposit * annualInterestRate / 100) + "у.е.");

        System.out.println("\n7. Определение оценки по предметам");
        int historyResult = 59;
        int programmingResult = 91;
        int historyPoints = 0;
        int programmingPoints = 0;

        if (historyResult <= 60) {
            historyPoints = 2;
        }
        if (historyResult > 60) {
            historyPoints = 3;
        }
        if (historyResult > 73) {
            historyPoints = 4;
        }
        if (historyResult > 91) {
            historyPoints = 5;
        }
        if (programmingResult <= 60) {
            programmingPoints = 2;
        }
        if (programmingResult > 60) {
            programmingPoints = 3;
        }
        if (programmingResult > 73) {
            programmingPoints = 4;
        }
        if (programmingResult > 91) {
            programmingPoints = 5;
        }
        System.out.println(historyPoints + " история");
        System.out.println(programmingPoints + " программирование");
        System.out.println("Средний балл оценок по предметам " + (historyPoints + programmingPoints) / 2);
        System.out.println("Средний % по предметам " + (historyResult + programmingResult) / 2);

        System.out.println("\n8. Расчет прибыли");
        int rentalPriceMonth = 5000;
        int revenueMonth = 9000;
        int costPriceMonth = 13000;
        System.out.println("прибыль за год: " + (costPriceMonth - revenueMonth - rentalPriceMonth)*12 + " руб.");
        
        System.out.println("\n9. Определение существования треугольника");
        int edge1 = 3;
        int edge2 = 4;
        int edge3 = 5;
        boolean existing = false;

        if (Math.sqrt(edge2 * edge2 + edge3 * edge3) == edge1) {
            existing = true;
            System.out.println("Треугольник существует");
            System.out.println("Катетами являются стороны с длинной " + edge2 + " и " 
                        + edge3 + ", а гипотенузой сторона с длиной  " + edge1);
            System.out.println("Площадь треугольника " + (edge2 * edge3 / 2));
        } else if (Math.sqrt(edge1 * edge1 + edge3 * edge3) == edge2) {
            existing = true;
            System.out.println("Треугольник существует");
            System.out.println("Катетами являются стороны с длинной " + edge1 + " и " 
                        + edge3 + ", а гипотенузой сторона с длиной  " + edge2);
            System.out.println("Площадь треугольника " + (edge1 * edge3 / 2));
        } else if (Math.sqrt(edge1 * edge1 + edge2 * edge2) == edge3) {
            existing = true;
            System.out.println("Треугольник существует");
            System.out.println("Катетами являются стороны с длинной " + edge1 + " и " 
                        + edge2 + ", а гипотенузой сторона с длиной  " + edge3);
            System.out.println("Площадь треугольника " + (edge1 * edge2 / 2));
        } else System.out.println("Треугольник не существует");
        if (existing) {
            System.out.println("|\\ ");
            System.out.println("| \\");
            System.out.println("|  \\");
            System.out.println("|___\\");
        }

        System.out.println("\n10. Подсчет количества банкнот");
        deposit = 567;
        int banknote50 = 0;
        int banknote10 = 0;
        int banknote1 = 0;
        
        if (deposit / 50 >= 1) {
            banknote50 = deposit / 50;
            System.out.println(banknote50 + " банкнот номиналом 50$");
            deposit = deposit % 50;
        }
        if (deposit / 10 >= 1) {
            banknote10 = deposit / 10;
            System.out.println(banknote10 + " банкнот номиналом 10$");
            deposit = deposit % 10;
        }
        if (deposit != 0) {
            banknote1 = deposit;
            System.out.println(banknote1 + " банкнот номиналом 1$");
        }
        System.out.println("Исходная сумма " + (50 * banknote50 + 10 * banknote10 + banknote1) + "$");
    }
}