package day14;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 * Реализовать статический метод
 * List<Person> parseFileToObjList(), который считывает содержимое того же
 * файла people.txt, создает экземпляры класса “Человек” и возвращает список
 * объектов. Получить данный список в методе main() и распечатать его в консоль.
 * В случае, если файла не существует в папке проекта, в программе необходимо
 * выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо
 * этого, если значение возраста отрицательно, необходимо выбрасывать исключение и
 * выводить в консоль сообщение “Некорректный входной файл”.
 */
public class PersonExRunner {
    public static void main(String[] args) throws Exception {
        List<Person> people = parseFileToObjList();
        people.forEach(System.out::println);
    }

    public static List<Person> parseFileToObjList() throws Exception {
        List<String> list = null;
        String file = "C:\\Users\\user\\IdeaProjects\\people.txt";
        Path path = Path.of(file);
        if (!Files.exists(path)) {
            throw new Exception("Файл не найден");
        }

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            list = reader.lines().toList();
        }

        List<Person> result = new ArrayList<>();
        for (String potentialPerson : list) {
            String[] people = potentialPerson.split(" ");
            if (people.length != 2 || Integer.parseInt(people[1]) < 0) {
                throw new Exception("“Некорректный входной файл”");
            }
            Person person = new Person(people[0], Integer.parseInt(people[1]));
            result.add(person);
        }
        return result;
    }
}
