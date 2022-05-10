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
        
            int produktX_Price = 100;
            int produktY_Price = 200;
            int discount = 11;

            int totalPrice = produktX_Price + produktY_Price;
            double totalDiscount = totalPrice / 100 * discount;

            double totaPriceWithDiscount = totalPrice - totalDiscount;

            System.out.println("Размер скидки составит - " + totalDiscount);

            System.out.println("Общая стоимость с учетом скидки составит - " +  totaPriceWithDiscount);

        System.out.println("\n3. Вывод на консоль слова JAVA");
        
            System.out.println("   J    a  v     v a ");
            System.out.println("   J   a a  v   v a a");
            System.out.println("J  J  aaaaa  V V aaaaa");
            System.out.println(" JJ  a     a  V a     a");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");

            byte byteType = 127;
            short shortType = 32_767;
            int intType = 2_147_483_647;
            long longType = 9_223_372_036_854_775_807l;

            System.out.println(byteType);
            byteType++;
            System.out.println(byteType);
            byteType--;
            System.out.println(byteType);

            System.out.println(shortType);
            shortType++;
            System.out.println(shortType);
            shortType--;
            System.out.println(shortType);

            System.out.println(intType);
            intType++;
            System.out.println(intType);
            intType--;
            System.out.println(intType);
            
            System.out.println(longType);
            longType++;
            System.out.println(longType);
            longType--;
            System.out.println(longType);

        System.out.println("\n5. Перестановка значений переменных");

            float firstFloat = 76.9f;
            float secondFloat = 89.4f;
            float thirdFloat = 0;

            System.out.println("Меняем переменные местами при помощи третьей перемнной");
                System.out.println("\nИсходное значение первой переменной " + firstFloat);
                System.out.println("Исходное значение второй переменной " + secondFloat);

                thirdFloat = firstFloat;
                firstFloat = secondFloat;
                secondFloat = thirdFloat;

                System.out.println("\nНовое значение первой переменной " + firstFloat);
                System.out.println("Новое значение второй переменной " + secondFloat);

            System.out.println("\nМеняем переменные местами при помощи арифметических операций");
                System.out.println("\nИсходное значение первой переменной " + firstFloat);
                System.out.println("Исходное значение второй переменной " + secondFloat);
                
                firstFloat = firstFloat + secondFloat;
                secondFloat = firstFloat - secondFloat;
                firstFloat = firstFloat - secondFloat;

                System.out.println("\nНовое значение первой переменной " + firstFloat);
                System.out.println("Новое значение второй переменной " + secondFloat);

            System.out.println("\nМеняем переменные местами при помощи побитовых операций");

                int digit = 10;

                System.out.println("\nИсходное значение первой переменной " + firstFloat);
                System.out.println("Исходное значение второй переменной " + secondFloat);

                firstFloat = firstFloat*digit;
                int firstInt = (int) firstFloat;
                    
                secondFloat = secondFloat*digit;
                int secondInt = (int) secondFloat;

                firstInt = firstInt^secondInt;

                secondInt = firstInt^secondInt;

                firstInt = firstInt^secondInt;

                firstFloat = (float) firstInt/digit;

                secondFloat = (float) secondInt/digit;

                System.out.println("\nНовое значение первой переменной " + firstFloat);
                System.out.println("Новое значение второй переменной " + secondFloat);

        System.out.println("\n6. Вывод символов и их кодов");

            int firstSymbolCode = 35;
            int secondSymbolCode = 38;
            int thirdSymbolCode = 64;
            int fouthSymbolCode = 94;
            int fithSymbolCode = 95;

            char firstSymbol = (char) firstSymbolCode;
            char secondSymbol = (char) secondSymbolCode;
            char thirdSymbol = (char) thirdSymbolCode;
            char fouthSymbol = (char) fouthSymbolCode;
            char fithSymbol = (char) fithSymbolCode;

           

            System.out.println(firstSymbolCode + " " + firstSymbol);
            System.out.println(secondSymbolCode + " " + secondSymbol);
            System.out.println(thirdSymbolCode + " " + thirdSymbol);
            System.out.println(fouthSymbolCode + " " + fouthSymbol);
            System.out.println(fithSymbolCode + " " + fithSymbol);

        System.out.println("\n7. Произведение и сумма цифр числа");

            int number = 345;

            int hundreds = number/100;

            number = number%100;

            int decades = number/10;

            int units = number%10;

            int summa = hundreds + decades + units;
            int composition = hundreds * decades * units;

            System.out.println("сумма цифр числа N = " + summa);
            System.out.println("произведение цифр числа N = " + composition);




            

        





    }
}