package day9.ex1;

/**
 * Создайте класс Человек (англ. Human). У человека должно быть поле “имя” (англ.
 * name). На это поле в классе должен быть конструктор, get и set методы. Также, у
 * Человека должен быть метод printInfo(), который выводит в консоль информацию
 * о человеке в формате: “Этот человек с именем ИМЯ”.
 */
public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
