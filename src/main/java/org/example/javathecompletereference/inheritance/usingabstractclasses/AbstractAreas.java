package org.example.javathecompletereference.inheritance.usingabstractclasses;

public class AbstractAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10, 10); // illegal now
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // this is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }

    /*
    As the comment inside main( ) indicates, it is no longer possible to declare objects of
    type Figure, since it is now abstract. And, all subclasses of Figure must override area( ).
     */

    /*
    e Figure. The variable figref is declared as a reference to Figure, which means
    that it can be used to refer to an object of any class derived from Figure.
     */
}
