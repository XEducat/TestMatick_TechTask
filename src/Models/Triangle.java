package Models;
import Interfaces.Shape;

public class Triangle implements Shape {
    private double base;
    private double height;
    private String color;

    public Triangle(double base, double height, String color) {
        this.base = base;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public String getColor() {
        return color;
    }
}