package day16;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Реализовать программу, записывающую числа разных типов в 2 файла.
 * Файл 1 должен называться “file1.txt”, а Файл 2 должен называться “file2.txt”.
 * Оба файла должны находиться в корне проекта. Создаваться файлы должны не
 * вручную, а при запуске программы.
 * Файл 1 должен содержать 1000 случайных чисел от 0 до 100.
 * Файл 2 создается на основании Файла 1, но содержит числа вещественного типа
 * данных.
 * Метод заполнения Файла 2 следующий: для каждой группы из 20 целых чисел из
 * Файла 1 рассчитывается их среднее арифметическое. Затем, полученное значение
 * записывается в Файл 2. Таким образом в Файле 2 будет находиться 50 вещественных
 * чисел (1000 / 20 = 50).
 * После того, как Файл 2 будет сформирован, необходимо реализовать статический
 * метод printResult(File file). Этот метод должен рассчитать сумму всех
 * вещественных чисел из Файла 2 и вывести её в консоль, отбросив вещественную
 * часть.
 */
public class Task2 {
    private static final Random random = new Random();

    public static void main(String[] args) throws IOException {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        writeToFile1(file1);
        writeToFile2(file2, file1);

        printResult(file2);
    }

    public static void printResult(File file) throws IOException {
        double sum = 0;
        Scanner sc = new Scanner(file);
        while (sc.hasNextDouble()) {
            sum += sc.nextDouble();
        }

        System.out.println((int) sum);
    }

    public static void writeToFile1(File file) {
        try (PrintWriter writer = new PrintWriter(file, StandardCharsets.UTF_8)) {
            for (int i = 0; i < 100; i++) {
                writer.write(String.valueOf(random.nextInt(0, 100)));
                writer.write(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeToFile2(File writeIntoFile, File readingFile) throws FileNotFoundException {
        int count = 0;
        double sum = 0;
        Scanner sc = new Scanner(new File("file1.txt"));
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        try (PrintWriter writer = new PrintWriter("file2.txt", StandardCharsets.UTF_8)) {
            for (Integer integer : list) {
                count++;
                sum += integer;
                if (count == 19) {
                    double avg = sum / count;
                    writer.write(String.format("%.2f", avg));
                    writer.write(" ");
                    count = 0;
                    sum = 0;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
