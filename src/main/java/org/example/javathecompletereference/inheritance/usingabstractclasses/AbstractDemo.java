package org.example.javathecompletereference.inheritance.usingabstractclasses;

public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }

    /*
    Notice that no objects of class A are declared in the program. As mentioned, it is not
    possible to instantiate an abstract class.

    class A implements a concrete
    method called callmetoo( ). This is perfectly acceptable.
     */

    /*
    Although abstract classes cannot be used to instantiate objects, they can be used to
    create object references, because Java’s approach to run-time polymorphism is implemented
    through the use of superclass references. Thus, it must be possible to create a reference to
    an abstract class so that it can be used to point to a subclass object.
     */
}
