package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte memorySize = 8;
        short processorFrequency = 2100;
        int quantityOfCore = 16;
        long occupiedSpaceHDD = 102679347200l;
        float totalSpaceHDD = 245.11f;
        double freeSpaceHDD = 146.69;
        char processorType = 'M';
        boolean isOn = true;

        System.out.println(memorySize);
        System.out.println(processorFrequency);
        System.out.println(quantityOfCore);
        System.out.println(occupiedSpaceHDD);
        System.out.println(totalSpaceHDD);
        System.out.println(freeSpaceHDD);
        System.out.println(processorType);
        System.out.println(isOn);
        
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int priceGoodsX = 100;
        int priceGoodsY = 200;
        int discount = 11;
        int totalPrice = priceGoodsX + priceGoodsY;
        double totalDiscount = totalPrice / 100 * discount;
        double discountPrice = totalPrice - totalDiscount;
        System.out.println("Размер скидки составит - " + totalDiscount);
        System.out.println("Общая стоимость с учетом скидки составит - " +  discountPrice);
        
        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte byteMaxMinNumber = 127;
        short shortMaxMinNumber = 32_767;
        int intMaxMinNumber = 2_147_483_647;
        long longMaxMinNumber = 9_223_372_036_854_775_807l;
        System.out.println(byteMaxMinNumber);
        System.out.println(++byteMaxMinNumber);
        System.out.println(--byteMaxMinNumber);
        System.out.println(shortMaxMinNumber);
        System.out.println(++shortMaxMinNumber);
        System.out.println(--shortMaxMinNumber);
        System.out.println(intMaxMinNumber);
        System.out.println(++intMaxMinNumber);
        System.out.println(--intMaxMinNumber);
        System.out.println(longMaxMinNumber);
        System.out.println(++longMaxMinNumber);
        System.out.println(--longMaxMinNumber);

        System.out.println("\n5. Перестановка значений переменных");
        float number1 = 76.9f;
        float number2 = 89.4f;
        float buffer = 0;

        System.out.println("Меняем переменные местами при помощи третьей переменной");
        System.out.println("\nИсходное значение первой переменной " + number1);
        System.out.println("Исходное значение второй переменной " + number2);
        buffer = number1;
        number1 = number2;
        number2 = buffer;
        System.out.println("\nНовое значение первой переменной " + number1);
        System.out.println("Новое значение второй переменной " + number2);

        System.out.println("\nМеняем переменные местами при помощи арифметических операций");
        System.out.println("\nИсходное значение первой переменной " + number1);
        System.out.println("Исходное значение второй переменной " + number2);
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("\nНовое значение первой переменной " + number1);
        System.out.println("Новое значение второй переменной " + number2);

        System.out.println("\nМеняем переменные местами при помощи побитовых операций");
        int multiplier = 10;
        System.out.println("\nИсходное значение первой переменной " + number1);
        System.out.println("Исходное значение второй переменной " + number2);
        number1 = number1 * multiplier;
        int buffer1 = (int) number1;
        number2 = number2 * multiplier;
        int buffer2 = (int) number2;
        buffer1 = buffer1 ^ buffer2;
        buffer2 = buffer1 ^ buffer2;
        buffer1 = buffer1 ^ buffer2;
        number1 = (float) buffer1 / multiplier;
        number2 = (float) buffer2 / multiplier;
        System.out.println("\nНовое значение первой переменной " + number1);
        System.out.println("Новое значение второй переменной " + number2);

        System.out.println("\n6. Вывод символов и их кодов");
        char code1 = 35;
        char code2 = 38;
        char code3 = 64;
        char code4 = 94;
        char code5 = 95;

        System.out.println((int) code1 + " " + code1);
        System.out.println((int) code2 + " " + code2);
        System.out.println((int) code3 + " " + code3);
        System.out.println((int) code4 + " " + code4);
        System.out.println((int) code5 + " " + code5);

        System.out.println("\n7. Произведение и сумма цифр числа");
        int scrNumber = 345;
        int hundreds = scrNumber / 100;
        int decades = scrNumber % 100 / 10;
        int units = scrNumber % 10;
        int sumDigits = hundreds + decades + units;
        int productDigits = hundreds * decades * units;

        System.out.println("сумма цифр числа N = " + sumDigits);
        System.out.println("произведение цифр числа N = " + productDigits);

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char openBracket = '(';
        char closeBracket = ')';
        char underscores = '_';
        char space = ' ';

        System.out.println("" + space + space + space + space + slash + backSlash + space + space + space + space);
        System.out.println("" + space + space + space + slash + space + space + backSlash + space + space + space);
        System.out.println("" + space + space + slash + underscores + openBracket + space + closeBracket + backSlash + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash + space);
        System.out.println("" + slash + underscores + underscores + underscores + underscores + slash + backSlash + underscores + underscores + backSlash);

        System.out.println("\n9. Отображение количества сотен, десятков и единиц числа");
        scrNumber = 123;
        hundreds = scrNumber / 100;
        decades = scrNumber % 100 / 10;
        units = scrNumber % 10;

        System.out.println("Число N содержит: " + hundreds + " сотен");
        System.out.println("Число N содержит: " + decades + " десятков");
        System.out.println("Число N содержит: " + units + " единиц");

        System.out.println("\n10. Преобразование секунд");
        int time = 86399;
        int hours = time / 3600;
        time = time % 3600;
        int minutes = time / 60;
        int seconds = time % 60;

        System.out.println(hours + ":" + minutes + ":" + seconds); 
    }
}