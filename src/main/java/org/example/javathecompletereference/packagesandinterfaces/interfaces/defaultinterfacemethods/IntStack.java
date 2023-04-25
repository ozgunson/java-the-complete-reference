package org.example.javathecompletereference.packagesandinterfaces.interfaces.defaultinterfacemethods;

public interface IntStack {
    void push(int item); // store an item
    int pop(); // retrieve an item
    // Because clear( ) has a default, it need not be
    // implemented by a preexisting class that uses IntStack.
    default void clear() {
        System.out.println("clear() not implemented.");
    }

    /*
    Thus, the default method gives you
        •	 a way to gracefully evolve interfaces over time, and
        •	 a way to provide optional functionality without requiring that a class provide a
        placeholder implementation when that functionality is not needed.


        In real-world code, clear( ) would have thrown an exception, rather than
        displaying an error message.
     */

    /*

     */
}
