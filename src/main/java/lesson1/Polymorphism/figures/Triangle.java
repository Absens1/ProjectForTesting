package lesson1.Polymorphism.figures;

import lesson1.Polymorphism.Shape;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Рисую треугольник");
    }
}
