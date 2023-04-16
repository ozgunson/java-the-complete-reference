package org.example.javathecompletereference.inheritance.usingabstractclasses;

// A Simple demonstration of abstract.
public abstract class A {
    abstract void callme();

    //conrete methods are still allowed in abstract classes.
    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}
