package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;


/**
 * Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30).
 * Заполнить его вручную десятью произвольными числами. Реализовать статический
 * метод printSumDigits(File file), который считает сумму всех чисел в этом
 * файле и выводит ее на экран. Вызвать данный метод в методе main().
 * Если файла не существует в папке проекта, в программе необходимо выбрасывать
 * исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если
 * чисел в файле меньше или больше 10, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */
public class Ex1 {
    public static void main(String[] args) throws Exception {
        printSumDigits(new File("C:\\Users\\user\\IdeaProjects\\txt.txt"));
    }

    public static void printSumDigits(File file) throws Exception {
        if (!file.exists()) {
            throw new Exception("Файл не найден");
        }
        List<String> list = null;
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            list = reader.lines().toList();
        } catch (Exception e) {
            e.getCause();
        }

        for (String s : list) {
            String[] arr = s.split(" ");
            if (arr.length != 10) {
                throw new Exception("Некорректный входной файл");
            } else {
                for (String digit : arr) {
                    if (isDigit(digit)) {
                        sum += Integer.parseInt(digit);
                    }
                }
            }
        }

        System.out.println(sum);
    }

    private static boolean isDigit(String digit) {
        try {
            Integer.parseInt(digit);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
