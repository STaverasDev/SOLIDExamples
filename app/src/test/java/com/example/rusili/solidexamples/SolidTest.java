package com.example.rusili.solidexamples;

import com.example.rusili.solidexamples.solid.after.AreaCalculator;
import com.example.rusili.solidexamples.solid.after.Circle;
import com.example.rusili.solidexamples.solid.after.ShapeInterface;
import com.example.rusili.solidexamples.solid.after.Square;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolidTest {

    @Test
    public void testAreaCalculator_whenUsingSquares_returnAnswer() {
        // Given
        AreaCalculator calculator = new AreaCalculator();

        // When
        Square square1 = new Square(4.0);
        Square square2 = new Square(4.0);
        ShapeInterface[] shapeArray = {square1, square2};

        // Then
        assertEquals(calculator.sumAllAreas(shapeArray), 32.0, 0.0);
    }

    @Test
    public void testAreaCalculator_whenUsingSquareAndCircle_returnAnswer() {
        // Given
        AreaCalculator calculator = new AreaCalculator();

        // When
        Square square1 = new Square(4.0);
        Circle circle1 = new Circle(4.0);
        ShapeInterface[] shapeArray = {square1, circle1};

        // Then
        assertEquals(calculator.sumAllAreas(shapeArray), 66.3, 0.1);
    }
}