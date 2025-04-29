package Interfaces;


/**
 * Interface representing a geometric shape.
 * Defines common behavior for all shape implementations.
 */
public interface Shape {
    void draw();
    double getArea();
    String getColor();
}