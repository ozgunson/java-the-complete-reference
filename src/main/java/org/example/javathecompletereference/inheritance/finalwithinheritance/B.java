package org.example.javathecompletereference.inheritance.finalwithinheritance;

public class B extends A {
    /*
    void meth() {
        System.out.println("Illegal!");
    }
    */
    // Because meth() is declared as final, it cannot be overridden in B

    /*
    Methods declared as final can sometimes provide a performance enhancement: The
    compiler is free to inline calls to them because it “knows” they will not be overridden by a
    subclass.
     */

    /*
    Inlining is an option only with
    final methods. Normally, Java resolves calls to methods dynamically, at run time. This is called
    late binding. However, since final methods cannot be overridden, a call to one can be resolved
    at compile time. This is called early binding
     */
}
