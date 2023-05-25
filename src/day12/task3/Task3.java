package day12.task3;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Создать 10 или более экземпляров
 * класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
 * которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
 * список. Создать статический метод в классе Task3:
 * public static List<MusicBand> groupsAfter2000(List<MusicBand>
 * bands)
 * Этот метод принимает список групп в качестве аргумента и возвращает новый список,
 * состоящий из групп, основанных после 2000 года. Вызвать метод
 * groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
 * из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
 * после 2000 года).
 */
public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> musicBands = new ArrayList<>(List.of(new MusicBand("NewJeans", 2022),
                new MusicBand("Chvrches", 2011), new MusicBand("Blackpink", 2016),
                new MusicBand("Le Sserafim", 2022), new MusicBand("Imagine Dragons", 2008),
                new MusicBand("Linkin Park", 1996), new MusicBand("Queen", 1970),
                new MusicBand("The Beatles", 1960), new MusicBand("Pink Floyd", 1965),
                new MusicBand("Nirvana", 1987)));

        Collections.shuffle(musicBands);

        musicBands.forEach(System.out::println);
        System.out.println("============================================");

        List<MusicBand> musicBandsAfter2000 = groupsAfter2000(musicBands);
        musicBandsAfter2000.forEach(System.out::println);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter(band -> band.getAge() > 2000).collect(Collectors.toList());
    }
}
