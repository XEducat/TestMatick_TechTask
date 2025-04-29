# Geometric Shapes Generator

Java application that demonstrates OOP principles through geometric shapes manipulation.

## 🎯 Features

- Random shape generation (Square, Circle, Triangle, Trapezoid)
- Factory pattern implementation
- Shape drawing and area calculation
- Customizable shape count

## 🛠️ Technologies

- Java 17+
- Maven (for dependency management)

## 📦 Project Structure

```
src/
├── Interface/
│   └── Shape.java
├── Models/
│   ├── Circle.java
│   ├── Square.java
│   ├── Triangle.java
│   └── Trapezoid.java
├── ShapeFactory.java
└── Main.java
```

## 🚀 Quick Start

1. Clone and navigate to project:
```bash
git clone https://github.com/yourusername/geometric-shapes.git
cd geometric-shapes
```

2. Run:
```bash
javac Main.java
java Main
```

## 💡 Usage

1. Enter min/max number of shapes
2. View generated shapes and properties

Example:
```
Enter minimum number of shapes: 1
Enter maximum number of shapes: 3

Drawing a square with side 6.07
Shape: square, area: 36.9 sq. units, side length: 6.1 units, perimeter: 24.3 units, color: red.
```

## 🧩 Design Patterns

- Factory Pattern (ShapeFactory)
- Polymorphism (Shape interface)
- Encapsulation (Shape classes)
