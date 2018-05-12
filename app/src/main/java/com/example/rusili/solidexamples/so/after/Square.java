package com.example.rusili.solidexamples.so.after;

public class Square implements ShapeInterface {
    private double length;

    public double getLength() {
        return length;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }
}
