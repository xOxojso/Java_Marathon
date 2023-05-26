package day12.task4;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * Выполнять в подпапке task4 в day12*
 * Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
 * группу можно было добавлять и удалять участников. Под участником понимается
 * строка (String) с именем и фамилией. Реализовать статический метод слияния групп
 * (в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
 * метода: transferMembers. Этот метод принимает в качестве аргументов два
 * экземпляра класса MusicBand. Реализовать метод printMembers (в классе
 * MusicBand), выводящий список участников в консоль. Проверить состав групп после
 * слияния.
 */
public class MusicBand {
    private final String name;
    private final int age;
    private final List<String> members;

    public MusicBand(String name, int age, List<String> members) {
        this.name = name;
        this.age = age;
        this.members = members;
    }

    public void addMember(String name) {
        members.add(name);
    }

    public void removeMember(String name) {
        members.remove(name);
    }

    public static void transferMembers(MusicBand firstMusicBand, MusicBand secondMusicBand) {
        for(String members : firstMusicBand.getMembers()) {
            secondMusicBand.getMembers().add(members);
        }
        firstMusicBand.getMembers().clear();
    }

    public void printMembers() {
        members.forEach(member -> System.out.print(member + " "));
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getMembers() {
        return members;
    }

    public String toString() {
        return "Name of group: " + name + ", " + "foundationDate: " + age;
    }
}
