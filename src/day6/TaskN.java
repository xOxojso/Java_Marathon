package day6;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        car.info();
        car.setYearOfRelease(2020);
        System.out.println(car.yearDifference(2023));

        System.out.println("===========================");

        Motorbike motorbike = new Motorbike(2020, "Black", "Yamaha MT-09 Tracer");
        motorbike.info();
        System.out.println(motorbike.yearDifference(2023));

        System.out.println("===========================");

        Airplane airplane = new Airplane("Boeing", 2020, 30.53F, 45);
        airplane.setYear(2021);
        airplane.setLength(31.5F);
        airplane.fillUp(1000);
        airplane.fillUp(500);
        airplane.info();

        System.out.println("===========================");

        Teacher teacher = new Teacher("Nikolay", "History");
        Student student = new Student("Ivan");

        teacher.evaluate(student);
    }
}
