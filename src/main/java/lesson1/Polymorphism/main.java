package lesson1.Polymorphism;

import lesson1.Polymorphism.figures.Circle;
import lesson1.Polymorphism.figures.Square;
import lesson1.Polymorphism.figures.Triangle;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        ArrayList<Shape> figures = new ArrayList<>(Arrays.asList(new Circle(), new Square(), new Triangle()));
        for (Shape figure : figures) { figure.draw(); }
    }
}
