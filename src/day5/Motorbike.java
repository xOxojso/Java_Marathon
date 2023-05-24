package day5;

/**
 * . Создать класс Мотоцикл (англ. Motorbike), с полями “Год выпуска”, “Цвет”,
 * “Модель”. Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
 * использовать). Придерживаться принципов инкапсуляции и использовать ключевое
 * слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
 * консоль
 */
public class Motorbike {
    private int yearOfRelease;
    private String color;
    private String model;

    public Motorbike(int yearOfRelease, String color, String model) {
        this.yearOfRelease = yearOfRelease;
        this.color = color;
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
