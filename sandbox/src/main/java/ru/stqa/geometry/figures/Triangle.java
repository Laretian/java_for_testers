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
    }

    public double area() {
        var P = perimeter() / 2;
        return Math.round(sqrt(P * (P - a) * (P - b) * (P - c)) * 100.0) / 100.0;
    }

    public double perimeter() {
        return (a + b + c);
    }

}
