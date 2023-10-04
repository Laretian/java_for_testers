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
            new Triangle(-5.0, 7.0, 9.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            // OK
        }
    }

    @Test
    void testEquality() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(3.0, 4.0, 5.0);
        var t3 = new Triangle(3.0, 4.0, 5.0);

        Assertions.assertEquals(t1, t2);
        Assertions.assertEquals(t1, t3);
        Assertions.assertEquals(t2, t3);
    }

    @Test
    void testEquality2() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(4.0, 5.0, 3.0);
        var t3 = new Triangle(5.0, 3.0, 4.0);

        Assertions.assertEquals(t1, t2);
        Assertions.assertEquals(t1, t3);
        Assertions.assertEquals(t2, t3);
    }

}
