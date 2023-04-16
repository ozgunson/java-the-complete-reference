package org.example.javathecompletereference.inheritance.dynamicmethoddispatch;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A(); // object of type A
        B b = new B(); // object of type B
        C c = new C(); // object of type C
        A r; // obtain a reference of type A
        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme
        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme
        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
    }

    /*
    Method overriding forms the basis for
    one of Java’s most powerful concepts: dynamic method dispatch. Dynamic method dispatch
    is the mechanism by which a call to an overridden method is resolved at run time, rather
    than compile time. Dynamic method dispatch is important because this is how Java
    implements run-time polymorphism.
     */

    /*
    a superclass reference variable can refer
    to a subclass object. Java uses this fact to resolve calls to overridden methods at run time.
     */
}
