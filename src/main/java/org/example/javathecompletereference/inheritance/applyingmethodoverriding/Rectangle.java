package org.example.javathecompletereference.inheritance.applyingmethodoverriding;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    //overriding are for rectangle
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
