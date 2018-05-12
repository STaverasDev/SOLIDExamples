package com.example.rusili.solidexamples.solid.before;

public class AreaCalculator {

    public double sumAllAreas() {
        Square square = new Square(4);
        Circle circle = new Circle(3);

        int area = 0;
        area += square.getArea();
        area += circle.getArea();

        return area;
    }
}
