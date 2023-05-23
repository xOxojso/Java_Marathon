package day4;

import java.util.Arrays;

/**
 * Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
 * матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
 * В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
 * строк несколько, вывести индекс последней из них.
 */
public class Ex3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }

        int sum = 0;
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            int temp = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                temp += matrix[i][j];
            }
            if (temp >= sum) {
                sum = temp;
                index = i;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("индекс строки, сумма чисел в которой максимальна: " + index);
    }
}
