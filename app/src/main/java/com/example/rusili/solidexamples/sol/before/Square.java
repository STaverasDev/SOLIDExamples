package com.example.rusili.solidexamples.sol.before;

public class Square extends Rectangle {

    @Override
    public double getArea() {
        return super.getArea(); // Squares don't have length AND height
    }
}
