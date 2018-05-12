package com.example.rusili.solidexamples.soli.before;

public class Square implements ShapeInterface {

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getVolume() {     // Squares don't have volumes. It's a 2D object.
        return 0;
    }
}
