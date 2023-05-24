package day9.ex2;
/**
 * У класса Прямоугольник будет два поля - ширина и высота.
 * В этих же классах, вам необходимо реализовать два метода (area() и
 * perimeter()). Реализация этих методов будет разной для каждой из геометрических
 * фигур. Формулы для вычисления площади и периметра легко находятся в интернете.
 */
public class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
