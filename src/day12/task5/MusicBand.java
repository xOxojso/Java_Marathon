package day12.task5;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Выполнять в подпапке task5 в day12*
 * Скопировать MusicBand из прошлого задания и доработать - теперь у участника
 * музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
 * участником понимается не строка, а объект класса MusicArtist. Необходимо
 * реализовать класс MusicArtist и доработать класс MusicBand (создать копию
 * класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
 * этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
 * проверить состав групп после слияния. Методы для слияния и для вывода участников
 * в консоль необходимо тоже переработать, чтобы они работали с объектами класса
 * MusicArtist.
 */
public class MusicBand {
    private final String name;
    private final int age;
    private final List<MusicArtist> members;

    public MusicBand(String name, int age, List<MusicArtist> members) {
        this.name = name;
        this.age = age;
        this.members = members;
    }

    public void addMember(MusicArtist musicArtist) {
        members.add(musicArtist);
    }

    public void removeMember(MusicArtist musicArtist) {
        members.remove(musicArtist);
    }

    public static List<MusicArtist> transferMembers(MusicBand firstMusicBand, MusicBand secondMusicBand) {
        return Stream.concat(Stream.of(firstMusicBand), Stream.of(secondMusicBand))
                .map(MusicBand::getMembers).flatMap(Collection::stream).collect(Collectors.toList());
    }

    public void printMembers() {
        members.forEach(System.out::println);
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public String toString() {
        return "Name of group: " + name + ", " + "foundationDate: " + age;
    }
}
