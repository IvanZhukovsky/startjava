public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int sumOdd = 0;
        int sumEven = 0;
        
        do {
            if (counter % 2 != 0) {
                sumOdd += counter;
            }
            if (counter % 2 == 0) {
                sumEven += counter;
            }
            ++counter;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + 
            sumEven + ", а нечетных = " + sumOdd);

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
        for (int i = maxNumber - 1; i > minNumber; i--) {
            System.out.println(i);
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int sum = 0;

        while (srcNumber >= 1) {
            System.out.print(srcNumber % 10);
            sum += srcNumber % 10;
            srcNumber /= 10;
        }
        System.out.println("\n" + sum);

        System.out.println("\n4. Вывод чисел на консоль в несколько строк");
        int count = 0;
        int beginNum = 1;
        int endNum = 24;
        int step = 2;
        int quantityNumbers = endNum / step;
        int quntityNumbersAll = quantityNumbers + (5 - (quantityNumbers % 5));
        srcNumber = beginNum;
        for (int i = 1; i <= quntityNumbersAll; i++) {
            if (i <= quantityNumbers) {
                System.out.printf("%3s", srcNumber);
            } else System.out.printf("%3s", 0);
            count++;
            if (count == 5) {
                count = 0;
                System.out.println();
            }
            srcNumber += step;
        }

        System.out.println("\n5. Проверка количества единиц на четность");
        srcNumber = 3141591;
        counter = 0;
        System.out.print("число " + srcNumber + " содержит ");
        while (srcNumber >= 1) {
            if (srcNumber % 10 == 1) {
                counter++;
            }
            srcNumber /= 10;
        }
        if (counter % 2 == 0) {
            System.out.println(counter + " (четное) количество единиц");
        } else System.out.println(counter + " (нечетное) количество единиц");
        
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
        for (int i = 1; i < 49; i += 2) {
                System.out.printf("%5s %5c %n", i, i);
        }
        for (int i = 98; i < 123; i += 2) {
                System.out.printf("%5s %5c %n", i, i);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNumber = 1234321;
        number1 = srcNumber;
        number2 = srcNumber;
        int multiplier = 10;
        count = 0;
        //определяем разрядность числа
        while (number2 >= 10) {
            number2 /= 10;
            count++;
        }
        number2 = 0;
        multiplier = (int) Math.pow(multiplier, count);
        //переворачиваем число и собираем его для возможности сравнения
        while (srcNumber >= 1) {
            number2 += ((srcNumber % 10) * multiplier);
            multiplier /= 10;
            srcNumber /= 10;
        }
        if (number1 == number2) {
            System.out.printf("Число %s является палиндромом %n", number1);
        } else System.out.printf("Число %s не являетcя палиндромом %n", number1);

        System.out.println("\n9. Определение, является ли число счастливым");
        srcNumber = 123321;
        count = 0;
        int sum1 = 0;
        int sum2 = 0;

        while (srcNumber >= 1) {
            if (count < 3) {
                sum1 += srcNumber % 10;
            } else sum2 += srcNumber % 10;
            count++;  
            srcNumber /= 10;
        }
        System.out.println("\nCумма цифр abc = "+ sum2);
        System.out.println("Сумма цифр efg = " + sum1);
        if (sum1 == sum2) {
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

    
