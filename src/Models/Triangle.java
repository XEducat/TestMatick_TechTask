package Models;
import Interfaces.Shape;

public class Triangle implements Shape {
    private final double base;
    private final double height;
    private final String color;

    public Triangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a triangle with base %.2f and height %.2f%n", base, height);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
    }

    @Override
    public String toString() {
        return String.format("Shape: triangle, area: %.1f sq. units, base: %.1f units, height: %.1f units, hypotenuse: %.1f units, color: %s.",
                getArea(), getBase(), getHeight(), getHypotenuse(), getColor());
    }
}