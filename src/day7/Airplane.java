package day7;

/**
 * Создать класс Самолет (Airplane) с полями:
 * - producer (изготовитель)
 * - year (год выпуска)
 * - length (длина)
 * - weight (вес)
 * - fuel (количество топлива в баке) + геттер для этого поля
 * Создать конструктор в классе Самолет, принимающий в качестве аргументов значения
 * четырех полей класса (значение поля “количество топлива в баке” установить равным0).
 * В конструкторе для передачи полям значений использовать ключевое слово this.
 * Помимо этого, в классе необходимо реализовать метод info(), который выводит
 * сообщение в следующем формате:
 * “Изготовитель: … , год выпуска: … , длина: ..., вес: ..., количество топлива в баке: …”
 * Также, необходимо реализовать метод fillUp(), который в качестве аргумента
 * принимает число и заправляет топливный бак самолета на это значение.
 * Создать новый объект класса Самолет с произвольными данными.
 * Изменить год выпуска и длину с помощью сеттеров, вызвать метод fillUp() два
 * раза, передав разные значения. Вызвать метод info().
 * <p>
 * Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего
 * дня.
 * В классе Самолет создать статический метод compareAirplanes, который в
 * качестве аргументов принимает два объекта класса Airplane (два самолета) и выводит
 * сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Airplane {
    private String producer;
    private int yearOfRelease;
    private float length;
    private float weight;
    private int fuel;

    public Airplane(String producer, int yearOfRelease, float length, float weight) {
        this.producer = producer;
        this.yearOfRelease = yearOfRelease;
        this.length = length;
        this.weight = weight;

        fuel = 0;
    }

    public void info() {
        System.out.println(String.format("Изготовитель %s, год выпуска %d, длинна %.2f, вес %.2f, количество топлива в баке %d",
                producer, yearOfRelease, length, weight, fuel));
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        String result = airplane1.length > airplane2.length ? "Первый самолет длиннее второго" :
                "Второй самолет длиннее первого";
        System.out.println(result);
    }

    public void fillUp(int fill) {
        fuel += fill;
    }

    public int getFuel() {
        return fuel;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setYear(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
}
