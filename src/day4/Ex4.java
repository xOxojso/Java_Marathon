package day4;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать новый массив размера 100 и заполнить его случайными числами из
 * диапазона от 0 до 10000.
 * Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
 * максимальной суммой выведите значение суммы и индекс первого элемента тройки.
 */
public class Ex4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int sum = 0;
        int index = 0;

        for (int i = 0; i <= array.length - 3; i++) {
            int tempSum = 0;

            for (int j = i; j < i + 3; j++) {
                tempSum += array[j];
            }

            if (tempSum > sum) {
                sum = tempSum;
                index = i;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(sum);
        System.out.println(index);

    }

}
