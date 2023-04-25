package org.example.javathecompletereference.inheritance.finalwithinheritance;

// The following class is illegal.
public class D { //extends C{ // ERROR! Can't subclass A
}

/*
Sometimes you will want to prevent a class from being inherited. To do this, precede the
class declaration with final.
Declaring a class as final implicitly declares all of its methods as
final, too. As you might expect, it is illegal to declare a class as both abstract and final since
an abstract class is incomplete by itself and relies upon its subclasses to provide complete
implementations.
 */
