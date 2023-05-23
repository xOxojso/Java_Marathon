package day4;


import java.util.Arrays;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Затем, используя циклы for each вывести:
 * - наибольший элемент массива
 * - наименьший элемент массива
 * - количество элементов массива, оканчивающихся на 0
 * - сумму элементов массива, оканчивающихся на 0
 * Использовать сортировку запрещено
 */

public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }

        int countElemEndWith0 = 0;
        int sumElemEndWith0 = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            max = Math.max(max, i);
            min = Math.min(min, i);

            if (i % 10 == 0) {
                countElemEndWith0++;
                sumElemEndWith0 += i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + countElemEndWith0);
        System.out.println("сумму элементов массива, оканчивающихся на 0: " + sumElemEndWith0);
    }
}
