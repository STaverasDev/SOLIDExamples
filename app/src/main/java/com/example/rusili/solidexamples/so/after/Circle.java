package com.example.rusili.solidexamples.so.after;

public class Circle implements ShapeInterface {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
