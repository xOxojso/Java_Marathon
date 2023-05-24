package day9.ex2;

/**
 * У класса Треугольник будет три поля - длина каждой из сторон
 * В этих же классах, вам необходимо реализовать два метода (area() и
 * perimeter()). Реализация этих методов будет разной для каждой из геометрических
 * фигур. Формулы для вычисления площади и периметра легко находятся в интернете.
 */
public class Triangle extends Figure {
    private final double firstLength;
    private final double secondLength;
    private final double thirdLength;

    public Triangle(double firstLength, double secondLength, double thirdLength, String color) {
        super(color);
        this.firstLength = firstLength;
        this.secondLength = secondLength;
        this.thirdLength = thirdLength;
    }

    @Override
    public double area() {
        double p = (firstLength + secondLength + thirdLength) / 2;
        return Math.sqrt(p * (p - firstLength) * (p - secondLength) * (p - thirdLength));
    }

    @Override
    public double perimeter() {
        return firstLength + secondLength + thirdLength;
    }
}
