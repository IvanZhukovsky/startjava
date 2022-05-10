public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("1. Создание переменных и вывод их значений на консоль");

        byte memorySize = 8;
        short processorFrequency = 2100;
        long occupiedSpaceHDD = 102679347200l;
        float totalSpaceHDD = 245.11f;
        double freeSpaceHDD = 146.69;
        char processorType = 'M';
        boolean isOn = true;

        System.out.println(memorySize);
        System.out.println(processorFrequency);
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

        System.out.println("");




    }
}