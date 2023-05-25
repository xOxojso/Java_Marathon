package day12.task5;

public class MusicArtist {
    private final String name;
    private final int age;

    public MusicArtist(String name, int age) {
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
        return "Artist name: " + name +", Artist age: " + age;
    }
}
