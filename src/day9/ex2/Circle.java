package day9.ex2;

/**
 * У класса Круг будет одно поле - радиус окружности.
 * В этих же классах, вам необходимо реализовать два метода (area() и
 * perimeter()). Реализация этих методов будет разной для каждой из геометрических
 * фигур. Формулы для вычисления площади и периметра легко находятся в интернете.
 */
public class Circle extends Figure {
    private final double circleRadius;

    public Circle(double circleRadius, String color) {
        super(color);
        this.circleRadius = circleRadius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(circleRadius, 2);
    }

    @Override
    public double perimeter() {
        return (Math.PI * 2) * circleRadius;
    }
}
