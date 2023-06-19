package com.bhoomi.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Triangle tri = new Triangle();
        Square sq = new Square();

        shape.area();
        tri.area();
        sq.area();
    }
}
