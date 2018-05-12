package com.example.rusili.solidexamples.so.after;

public class AreaCalculator {

    public double sumAllAreas(ShapeInterface[] shapes) {
        int area = 0;

        for (ShapeInterface shape : shapes) {
            area += shape.getArea();
        }

        return area;
    }
}
