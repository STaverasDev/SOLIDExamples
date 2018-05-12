package com.example.rusili.solidexamples.solid.after;

public class AreaCalculator {

    public double sumAllAreas(ShapeInterface[] shapes) {
        double area = 0;

        for (ShapeInterface shape : shapes) {
            area += shape.getArea();
        }

        return area;
    }
}
