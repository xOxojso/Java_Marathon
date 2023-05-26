package day14;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Создать в папке проекта файл people.txt в котором хранятся имена и возраст
 * людей. Реализовать статический метод
 * List<String> parseFileToStringList(), который считывает содержимое этого
 * файла и возвращает список, состоящий из значений имен и возрастов каждого
 * человека. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
 * этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */
public class Ex2 {
    public static void main(String[] args) throws Exception {
        List<String> list = parseFileToStringList();
        System.out.println(list);
    }

    public static List<String> parseFileToStringList() throws Exception {
        List<String> result = null;
        String file = "C:\\Users\\user\\IdeaProjects\\people.txt";
        Path path = Path.of(file);
        if (!Files.exists(path)) {
            throw new Exception("Файл не найден");
        }
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            result = reader.lines().toList();
        }

        for (String str : result) {
            String digit = str.replaceAll("[*A-Za-zА-Яа-я]", "").trim();
            if (Integer.parseInt(digit) < 0) {
                throw new Exception("Некорректный входной файл");
            }
        }
        return result;
    }
}
