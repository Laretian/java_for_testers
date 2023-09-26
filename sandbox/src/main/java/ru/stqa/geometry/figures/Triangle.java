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
        return Math.round(sqrt((perimeter() / 2) * (perimeter() - this.a) * (perimeter() - this.b) * (perimeter() - this.c)) * 100.0) / 100.0;
    }

    public double perimeter() {
        return (this.a + this.b + this.c);
    }

}
