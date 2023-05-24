package day9.ex1;

import day9.ex1.Human;

/**
 * Затем, создайте класс Студент (англ. Student), который наследуется от класса
 * Человек. У студента есть дополнительное строковое поле - название его учебной
 * группы. Для этого поля тоже необходимо создать геттер и сеттер. Конструктор в
 * классе Студент должен принимать на вход два аргумента - имя и название учебной
 * группы. Метод printInfo() в классе Студент должен быть переопределен таким
 * образом, чтобы формат выводимого в консоль сообщения был таким:
 * “Этот человек с именем ИМЯ”
 * “Этот студент с именем ИМЯ”
 * (должно выводиться именно две строки - необходимо использовать ключевое слово
 * super)
 */
public class Student extends Human {
    private String nameOfGroup;

    public Student(String name, String nameOfGroup) {
        super(name);
        this.nameOfGroup = nameOfGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + super.getName());
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }
}
