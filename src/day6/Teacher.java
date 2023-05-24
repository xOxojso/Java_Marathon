package day6;

import java.util.Random;

/**
 * Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”. Создать
 * класс Student (Студент) с полем “Имя”.
 * Каждый класс имеет конструктор (с параметрами), set и get методы по
 * необходимости, а также у преподавателя есть метод evaluate (оценить студента),
 * принимающий в качестве аргумента студента, и работающий следующим образом:
 * внутри метода случайным образом генерируется число от 2 до 5, выводится строка:
 * "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента с именем ИМЯСТУДЕНТА
 * по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
 * Все слова, написанные большими буквами, должны быть заменены
 * соответствующими значениями. ОЦЕНКА должна принимать значения "отлично”,
 * "хорошо”, "удовлетворительно" или "неудовлетворительно", в зависимости от
 * значения случайного числа.
 */
public class Teacher {
    private final String name;
    private String academicSubject;

    public Teacher(String name, String academicSubject) {
        this.name = name;
        this.academicSubject = academicSubject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int i = random.nextInt(2, 5);
        System.out.println(String.format("Преподаватель %s оценил студента %s по предмету %s на оценку %s",
                this.name, student.getName(), this.academicSubject, getEstimation(i)));
    }

    private String getEstimation(int value) {
        if (value < 2 || value > 5) return "invalid value";

        return value == 2 ? "неудовлетворительно" : value == 3 ? "удовлетворительно" : value == 4 ? "хорошо”" :
                "отлично”";
    }

    public String getName() {
        return name;
    }

    public String getAcademicSubject() {
        return academicSubject;
    }

    public void setAcademicSubject(String academicSubject) {
        this.academicSubject = academicSubject;
    }
}
