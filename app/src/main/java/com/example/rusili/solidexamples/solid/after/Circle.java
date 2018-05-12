package com.example.rusili.solidexamples.solid.after;


public class Circle implements ShapeInterface {

    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
