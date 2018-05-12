package com.example.rusili.solidexamples.solid.after;


public class Square implements ShapeInterface {

    public Square(double length) {
        this.length = length;
    }

    private double length;

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
}
