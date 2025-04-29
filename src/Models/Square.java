package Models;
import Interfaces.Shape;

public class Square implements Shape {
    private double side;
    private String color;

    public Square(double side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square with side " + side);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getSide() {
        return side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return String.format("Shape: square, area: %.1f sq. units, side length: %.1f units, perimeter: %.1f units, color: %s.",
                getArea(), getSide(), getPerimeter(), getColor());
    }
}