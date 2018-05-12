package com.example.rusili.solidexamples.so.before;

public class AreaCalculator {

    public double sumAllAreas(Object[] shapes) {
        int areaSum = 0;

        for (Object shape : shapes) {
            if (shape.getClass().isInstance(Square.class)) {
                areaSum += Math.pow(((Square) shape).getLength(), 2);
            } else if (shape.getClass().isInstance(Circle.class)) {
                areaSum += Math.pow(((Circle) shape).getRadius(), 2) * Math.PI;
            }
        }

        return areaSum;
    }
}
