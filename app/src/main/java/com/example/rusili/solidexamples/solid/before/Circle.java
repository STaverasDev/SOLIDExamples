package com.example.rusili.solidexamples.solid.before;

import com.example.rusili.solidexamples.so.after.ShapeInterface;

public class Circle {

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
