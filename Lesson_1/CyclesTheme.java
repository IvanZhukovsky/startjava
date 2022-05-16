public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int number = -10;
        int summaOddNumbers = 0;
        int summaEvenNumbers = 0;
        
        do {
            if (number % 2 != 0) {
                summaOddNumbers = summaOddNumbers + number;
            }
            if (number % 2 == 0) {
                summaEvenNumbers = summaEvenNumbers + number;
            }
            ++number;
        } while (number <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + 
            summaEvenNumbers + ", а нечетных = " + summaOddNumbers);

        System.out.println("\n2. Вывод чисел в интервале между (max и min)");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int minNumber = number1;
        int maxNumber = number1;

        if (number2 < minNumber) {
            minNumber = number2;
        }
        if (number3 < minNumber) {
            minNumber = number3;
        }
        if (number2 > maxNumber) {
            maxNumber = number2;
        }
        if (number3 > maxNumber) {
            maxNumber = number3;
        }
        for (int i = maxNumber; i >= minNumber; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        number = 1234;
        int divider = 10;
        int count = 0;
        int summa = 0;

        while (number >= divider) {
            if (number % divider != 0) {
                number = number - (divider / 10);
                count++;
            } else {
                divider = divider * 10;
                System.out.print(count);
                summa = summa + count;
                count = 0;
            }
            if (number / (divider / 10) < 10) {
                count = number / (divider / 10);
                System.out.print(count);
                summa = summa + count;
            } 
        }
        System.out.println("\n" + summa);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        count = 0;
        int beginNum = 1;
        int endNum = 24;
        int step = 2;
        int quantityNumbers = endNum / step;
        int quntityNumbersAll = quantityNumbers + (5 - (quantityNumbers % 5));
        number = beginNum;
        for (int i = 1; i <= quntityNumbersAll; i++) {
            if (i <= quantityNumbers) {
                System.out.printf("%3s", number);
            } else System.out.printf("%3s", 0);
            count++;
            if (count == 5) {
                count = 0;
                System.out.println();
            }
            number = number + step;
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        number = 3141591;
        int quantityOnes = 0;
        divider = 10;
        count = 0;

        System.out.print("число " + number + " содержит ");
        while (number >= divider) {
            if (number % divider != 0) {
                number = number - (divider / 10);
                count++;
            } else {
                divider = divider * 10;
                if (count == 1) {
                    quantityOnes++;
                }
                count = 0;
            }
            if (number / (divider / 10) < 10) {
                count = number / (divider / 10);
                if (count == 1) {
                    quantityOnes++;
                }
            } 
        }
        if (quantityOnes % 2 == 0) {
            System.out.println(quantityOnes + " (четное) количество единиц");
        } else System.out.println(quantityOnes + " (нечетное) количество единиц");
        
        System.out.println("\n6. Отображение фигур в консоли");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int katet1 = 5;
        int katet2 = 5;
        while (katet1 != 0) {
            while (katet2 != 0){
                System.out.print("#");
                katet2--;
            }
            System.out.println();
            katet1--;
            katet2 = katet1;
        }
        System.out.println();
        katet1 = 1;
        katet2 = 1;
        int hypotenuse = 5;
        do {
            do {
                System.out.print("$");
                katet1--;
            } while (katet1 != 0);
                if (hypotenuse > 3) {
                    katet2++;
                } else katet2--;
                katet1 = katet2;
            hypotenuse--;
            System.out.println();
        } while (hypotenuse != 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%5s %5s %n", "Dec", "Char");
        for (int i = 0; i <= 127; i++) {
            if (i < 48 && i % 2 != 0) {
                System.out.printf("%5s %5c %n", i, i);
            }
            if (i > 60 && i < 123 && i % 2 == 0) {
                System.out.printf("%5s %5c %n", i, i);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number = 1234321;
        number1 = number;
        number2 = number;
        divider = 10;
        int multiplier = 10;
        count = 0;
        //определяем разрядность числа
        while (number2 >= divider) {
            number2 = number2 / divider;
            count++;
        }
        number2 = 0;
        multiplier = (int) Math.pow(multiplier, count);
        //переворачиваем число и собираем его
        count = 0;
        while (number >= divider) {
            if (number % divider != 0) {
                number = number - (divider / 10);
                count++;
            } else {
                divider = divider * 10;
                number2 = number2 + (count * multiplier);
                count = 0;
                multiplier = multiplier / 10;
            }
            if (number / (divider / 10) < 10) {
                count = number / (divider / 10);
                number2 = number2 + count;
            } 
        }
        if (number1 == number2) {
            System.out.printf("Число %s является палиндромом %n", number1);
        } else System.out.printf("Число %s не являетcя палиндромом %n", number1);

        System.out.println("\n9. Определение, является ли число счастливым");
        number = 123321;
        divider = 10;
        count = 0;
        int count1 = 0;
        int summa1 = 0;
        int summa2 = 0;

        while (number >= divider) {
            if (number % divider != 0) {
                number = number - (divider / 10);
                count++;
            } else {
                divider = divider * 10;
                System.out.print(count);
                if (count1 < 3) {
                    summa1 = summa1 + count;
                    count1++;
                } else summa2 = summa2 + count;
                count = 0;
            }
            if (number / (divider / 10) < 10) {
                count = number / (divider / 10);
                System.out.print(count);
                summa2 = summa2 + count;
            } 
        }
        System.out.println("\nCумма цифр abc = "+ summa2);
        System.out.println("Сумма цифр efg = " + summa1);
        if (summa1 == summa2) {
            System.out.println("число является счастливым");
        } else System.out.println("число не является счастливым");

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        for (int i = 1; i <= 9; i++ ) {
            for (int j = 1; j <= 9; j++) {
                if (i * j != 1) {
                    if (j != 1) {
                        System.out.printf("%3s", i * j);
                    } else System.out.printf("%s", i * j);
                } else System.out.printf("%s", " ");
                if (j == 1) {
                    System.out.print("|");
                }
            }
            if (i == 1) {
                System.out.println("");
                for (int k = 1; k <= 25; k++) {
                    System.out.printf("%s", "-");
                }
            }
            System.out.println();
        }
    }
}

    
