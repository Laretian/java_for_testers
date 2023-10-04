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
        Assertions.assertEquals(21.0, new Triangle(5.0, 7.0, 9.0).perimeter());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-5, 7, 9);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

    @Test
    void cannotTriangleInequalityIsViolated() {
        try {
            new Triangle(-5, 7, 9);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

}
