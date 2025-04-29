package Models;
import Interfaces.Shape;

public class Trapezoid implements Shape {
    private final double base1;
    private final double base2;
    private final double height;
    private final String color;

    public Trapezoid(double base1, double base2, double height, String color) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing a trapezoid with bases %.2f and %.2f, height %.2f%n", base1, base2, height);
    }

    @Override
    public double getArea() {
        return (base1 + base2) * height / 2;
    }

    @Override
    public String getColor() {
        return color;
    }

    public double getBase1() {
        return base1;
    }

    public double getBase2() {
        return base2;
    }

    public double getMidline() {
        return (base1 + base2) / 2;
    }

    @Override
    public String toString() {
        return String.format("Shape: trapezoid, area: %.1f sq. units, bases: %.1f units and %.1f units, midline: %.1f units, color: %s.",
                getArea(), getBase1(), getBase2(), getMidline(), getColor());
    }
}