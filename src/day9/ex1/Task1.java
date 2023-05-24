package day9.ex1;

/**
 * Создайте в методе main() класса Task1 объект класса Студент и объект класса
 * Преподаватель. Выведите в консоль название учебной группы у объекта-студента и
 * название предмета у объекта-преподавателя. Затем, вызовите printInfo() на
 * объектах и посмотрите на результат.
 */
public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "A");
        Teacher teacher = new Teacher("Alexandr", "History");
        System.out.println(student.getNameOfGroup());
        System.out.println(teacher.getItemName());

        student.printInfo();
        teacher.printInfo();
    }
}
