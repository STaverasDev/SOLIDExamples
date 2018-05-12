package com.example.rusili.solidexamples.solid.before;

import com.example.rusili.solidexamples.so.after.ShapeInterface;

public class Square {

    public Square(double length) {
        this.length = length;
    }

    private double length;

    public double getLength() {
        return length;
    }

    public double getArea() {
        return Math.pow(length, 2);
    }
}
