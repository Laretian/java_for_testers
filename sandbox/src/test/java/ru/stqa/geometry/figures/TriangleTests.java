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

        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality2() {
        var t1 = new Triangle(3.0, 4.0, 5.0);
        var t2 = new Triangle(4.0, 5.0, 3.0);

        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality3() {
        var a = 2;
        var b = 3;
        var c = 4;

        var triangle = new Triangle(a, b, c);
        var triangle1 = new Triangle(a, c ,b);

        Assertions.assertEquals(triangle, triangle1);
    }

}
