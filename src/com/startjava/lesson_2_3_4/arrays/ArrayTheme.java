package com.startjava.lesson_2_3_4.arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int len = nums.length;
        System.out.println("Исходный массив:");
        printArray(nums);
        for (int i = 0; i < len / 2; i++) {
            int buffer = nums[i];
            nums[i] = nums[len - i - 1];
            nums[len - i - 1] = buffer;
        }
        System.out.println("Перевернутый массив:");
        printArray(nums);

        System.out.println("\n2. Вывод произведения элементов массива");
        nums = new int[10];
        len = nums.length;
        for (int i = 0; i < len; i++) {
            nums[i] = i;
        }
        int product = 1;
        for (int i = 1; i < (len - 1); i++) {
            product *= nums[i];
            System.out.print(i < len - 2 ? i + " * " : i + " = ");
        }
        System.out.println(product);
        System.out.println("элемент " + nums[0] + " находится под индексом 0");
        System.out.println("элемент " + nums[9] + " находится под индексом 9");

        System.out.println("\n3. Удаление элементов массива");
        float[] nums2 = new float[15];
        len = nums2.length;
        for (int i = 0; i < len; i++) {
            nums2[i] = (float) Math.random();
        }
        System.out.println("Исходный массив");
        printArray(nums2);
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums2[i] > nums2[len / 2]) {
                count++;
                nums2[i] = 0;
            }
        }
        System.out.println("Измененный массив");
        printArray(nums2);
        System.out.println("количество обнуленных ячеек " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        len = letters.length;
        for (int i = 65; i < 91; i++) {
            letters[i - 65] = (char) i;
        }
        for (int i = len - 1; i >= 0; i--) {
            for (int j = len - 1; j >= i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Работа с max и min числами");
        nums = new int[30];
        len = nums.length;
        int randomNumber;
        boolean newNum;
        for (int i = 0; i < len; i++) {
            do {
                randomNumber = (int) ((Math.random() * 41) + 60);
                newNum = true;
                for (int num : nums) {
                    if (num == randomNumber) {
                        newNum = false;
                    }
                }
            } while (!newNum);
            nums[i] = randomNumber;
            System.out.print((i + 1) % 10 == 0 ? nums[i] + "\n" : nums[i] + " ");
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] srcStrings = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        len = srcStrings.length;
        String[] destStrings = new String[len];

        System.out.println("Исходный массив");
        printArray(srcStrings);
        int count1;
        int count2 = 0;
        for (int i = 0; i < len; i++) {
            if (!srcStrings[i].equals("")) {
                count1 = 1;
                for (int j = i + 1; j < len; j++) {
                    if (!srcStrings[j].equals("")) {
                        count1++;
                    } else break;
                }
                System.arraycopy(srcStrings, i, destStrings, count2, count1);
                i = i + count1 - 1;
                count2 = count2 + count1;
            }
        }
        System.out.println("\nИзмененный массив");
        printArray(destStrings);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void printArray(float[] nums) {
        for (float num : nums) {
            System.out.println(num);
        }
    }

    private static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.print(string + " ");
        }
    }

}
