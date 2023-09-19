package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateAreaTriangle() {
        Assertions.assertEquals(17.41, new Triangle(5.0, 7.0, 9.0).area());
    }

    @Test
    void canCalculatePerimeterTriangle() {
        Assertions.assertEquals(10.5, new Triangle(5.0, 7.0, 9.0).perimeter());
    }

}
