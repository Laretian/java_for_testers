package ru.stqa.geometry.figures;

public record Square(double side) {

//    public static void printSquareArea(double side) {
//        String text = String.format("Площадь квадрата со стороной %f = %f", side, area(side));
//        System.out.println(text);
//    }
//
//    public static double area(double a) {
//        return a * a;
//    }
//
//    public static double perimeter(double a) {
//        return 4 * a;
//    }

    public static void printSquareArea(Square s) {
        String text = String.format("Площадь квадрата со стороной %f = %f", s.side, s.area());
        System.out.println(text);
    }

//    private double side;
//
//    public Square(double side) {
//        this.side = side;
//    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * this.side;
    }
}
