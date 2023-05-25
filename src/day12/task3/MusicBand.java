package day12.task3;

/**
 * Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
 * (название музыкальной группы и год основания).
 */
public class MusicBand {
    private final String name;
    private final int age;

    public MusicBand(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name of group: " + name +", " + "foundationDate: " + age;
    }
}
