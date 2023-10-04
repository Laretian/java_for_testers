package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public class Triangle {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side should be is non-negative");
        } else if ((a + b < c) || (a + c < b) || (b + c < a)) {
            throw new IllegalArgumentException("Triangle inequality is violated");
        }
    }

    public double area() {
        var P = perimeter() / 2;
        return Math.round(sqrt(P * (P - a) * (P - b) * (P - c)) * 100.0) / 100.0;
    }

    public double perimeter() {
        return (a + b + c);
    }

}
