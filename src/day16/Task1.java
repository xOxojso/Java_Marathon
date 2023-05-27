package day16;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Реализовать программу, которая на вход принимает txt файл с целыми числами
 * (можно использовать файл из задания 1 дня 14) и в качестве ответа выводит в
 * консоль среднее арифметическое этих чисел.
 * Ответ будет являться вещественным числом. В консоль необходимо вывести полную
 * запись вещественного числа (со всеми знаками после запятой) и сокращенную запись
 * (с 3 знаками после запятой).
 * Детали реализации: В классе Task1 создать публичный статический метод
 * printResult(File file), в котором реализовать вышеописанную логику. В методе
 * main() класса Task1 вызвать метод printResult(File file), передав ему в
 * качестве аргумента объект класса File (txt файл с целыми числами).
 */
public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\user\\IdeaProjects\\txt.txt";
        File file = new File(fileName);

        double result = printResult(file);
        System.out.println(result);
        System.out.println(String.format("%.3f", result));
    }

    public static double printResult(File file) throws FileNotFoundException {
        int count = 0;
        double sum = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            try {
                sum += sc.nextInt();
                count++;
            } catch (Exception e) {

            }
        }
        return sum / count;
    }
}
