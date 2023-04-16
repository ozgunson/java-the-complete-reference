package org.example.javathecompletereference.inheritance.morepracticalexample;

// Here, Box is extended to include color.
public class ColorBox extends Box{
    int color; // color of box
    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}
