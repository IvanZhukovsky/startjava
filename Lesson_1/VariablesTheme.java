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
            

        





    }
}