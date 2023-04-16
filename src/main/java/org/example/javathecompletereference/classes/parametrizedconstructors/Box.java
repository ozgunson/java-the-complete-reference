package org.example.javathecompletereference.classes.parametrizedconstructors;

public class Box {
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }

    // 'this' can be used inside any method to refer to the current object.
    // Use 'this' to resolve name-space collisions.
    /*
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }*/

}
