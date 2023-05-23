package day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * С клавиатуры вводится число n - размер массива. Необходимо создать массив
 * указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
 * содержимое массива в консоль, а также вывести в консоль информацию о:
 * а) Длине массива
 * б) Количестве чисел больше 8
 * в) Количестве чисел равных 1
 * г) Количестве четных чисел
 * д) Количестве нечетных чисел
 * е) Сумме всех элементов массива
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Количестве чисел больше 8: " + Arrays.stream(array).filter(i -> i > 8).count());
        System.out.println("Количестве чисел равных 1: " + Arrays.stream(array).filter(i -> i == 1).count());
        System.out.println("Количестве четных чисел: " + Arrays.stream(array).filter(i -> i % 2 == 0).count());
        System.out.println("Количестве нечетных чисел: " + Arrays.stream(array).filter(i -> i % 2 != 0).count());
        System.out.println("Сумме всех элементов массива: " + Arrays.stream(array).sum());
    }
}
