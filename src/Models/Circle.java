package Models;
import Interfaces.Shape;

public class Circle implements Shape {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a circle with radius %.2f%n", radius);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public String toString() {
        return String.format("Shape: circle, area: %.1f sq. units, radius: %.1f units, diameter: %.1f units, color: %s.",
                getArea(), getRadius(), getDiameter(), getColor());
    }
}