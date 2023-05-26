package day15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Вам дан файл с информацией об остатках обуви на складе
 * (src/main/resources/shoes.csv). Это пример реальной выгрузки остатков из 1С
 * в csv файл (формат файла с разделителями, в качестве разделителя использован
 * символ “;”). В этом файле содержится информация о названии модели обуви, ее
 * размер и оставшееся на складе количество.
 * До преобразования в csv это была таблица с тремя колонками:
 * Название Размер Кол-во
 * Ботинки HS РАН-Р 400 чер. ЗП 45 4
 * Ботинки PANDA САНИТАРИ 3916 S1 SRC бел. 37 1
 * ...
 * Необходимо сформировать новый файл
 * (src/main/resources/missing_shoes.txt) с информацией о моделях и
 * размерах обуви, которой нет на складе (количество = 0). Для этого реализуйте
 * программу, которая принимает на вход csv файл и создает новый txt файл
 * следующего содержания (должно получиться 11 строк):
 * Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
 * Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
 * Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
 * ...
 */
public class Ex1 {
    public static void main(String[] args) {
        Path fromPath = Path.of("C:\\Users\\user\\IdeaProjects\\JavaMarathon\\files\\shoes.csv");
        List<String> list = null;
        try (BufferedReader reader = Files.newBufferedReader(fromPath)) {
            list = reader.lines().toList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Path toPath = Path.of("C:\\Users\\user\\IdeaProjects\\JavaMarathon\\files\\missing_shoes.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(toPath)) {
            for (String information : list) {
                if (information.endsWith(";0")) {
                    String replaceInfo = information.replaceAll(";", ", ");
                    writer.write(replaceInfo);
                    writer.write("\n");
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
