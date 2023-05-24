package day5;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfRelease(2020);
        car.setColor("Black");
        car.setModel("BMW");

        System.out.println(car.getYearOfRelease());
        System.out.println(car.getColor());
        System.out.println(car.getModel());

        System.out.println("=======================================");

        Motorbike motorbike = new Motorbike(2020, "Black", "Yamaha MT-09 Tracer");
        System.out.println(motorbike.getYearOfRelease());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());
    }
}
