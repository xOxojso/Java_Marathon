package day14;

/**
 * Создать класс “Человек” с полями “имя” и “возраст”.
 */
public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person: %s, %d", this.name, this.age);
    }
}
