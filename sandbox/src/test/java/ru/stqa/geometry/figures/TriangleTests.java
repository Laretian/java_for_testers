package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateAreaTriangle() {
        Assertions.assertEquals(237.59, new Triangle(5.0, 7.0, 9.0).area());
    }

    @Test
    void canCalculatePerimeterTriangle() {
        Assertions.assertEquals(21.0, new Triangle(5.0, 7.0, 9.0).perimeter());
    }

}
