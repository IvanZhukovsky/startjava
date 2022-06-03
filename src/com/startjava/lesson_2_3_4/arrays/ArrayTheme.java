package com.startjava.lesson_2_3_4.arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1. Реверс значений массива");
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Исходный массив:");
        for (int i: nums) {
            System.out.println(i);
        }
        for (int i = 0; i < nums.length / 2; i++) {
            int buffer = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = buffer;
        }
        System.out.println("Перевернутый массив:");
        for (int i: nums) {
            System.out.println(i);
        }

        System.out.println("\n2. Вывод произведения элементов массива");
        nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
        }
        int composition = 1;
        for (int i = 1; i < (nums.length - 1); i++) {
            nums[i] = i;
            composition = composition * i;
            if (i != nums.length - 2) {
                System.out.print(i + " * ");
            } else System.out.print(i + " = ");
        }
        System.out.println(composition);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                System.out.println("цифра 0 находится в массиве под индексом: " + i);
            }
            if (nums[i] == 9) {
                System.out.println("цифра 9 находится в массиве под индексом: " + i);
            }
        }

        System.out.println("\n3. Удаление элементов массива");

        float[] nums2 = new float[15];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = (float) Math.random();
        }
        System.out.println("Исходный массив");
        for (float num: nums2) {
            System.out.println(num + " ");
        }
        int count = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] > nums2[7]) {
                count++;
                nums2[i] = 0;
            }
        }
        System.out.println("Измененный массив");
        for (float num: nums2) {
            System.out.println(num + " ");
        }
        System.out.println("количество обнуленных ячеек " + count);

        System.out.println("\n4. Вывод элементов массива лесенкой в обратном порядке");
        char[] letters = new char[26];
        for (int i = 65; i < 91; i++) {
            letters[i - 65] = (char) i;
        }
        for (int i = letters.length - 1; i >=0; i--) {
            for (int j = letters.length - 1; j >= i; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }

        System.out.println("\n5. Работа с max и min числами");
        nums = new int[30];
        int randomNumber;
        boolean flag;
        for (int i = 0; i < nums.length; i++) {
            do {
                randomNumber = (int) ((Math.random() * 41) + 60);
                flag = false;
                for (int number: nums) {
                    if (number == randomNumber) {
                        flag = true;
                    }
                }
            } while (flag);
            nums[i] = randomNumber;
            System.out.print(nums[i] + " ");
            if (i == 9 || i == 19) {
                System.out.println();
            }
        }

        System.out.println("\n\n6. Сдвиг элементов массива");
        String[] sourceArray = {"", "AA", "", "", "BBB", "C", "", "DDDD"};
        String[] destArray = new String[sourceArray.length];
        System.arraycopy(sourceArray, 0, destArray, 0, sourceArray.length);

        System.out.println("Исходный массив");
        for (String string: sourceArray) {
            System.out.print(string + " ");
        }
        System.out.println("\nКопия исходного массива");
        for (String string: destArray) {
            System.out.print(string + " ");
        }
    }
}
