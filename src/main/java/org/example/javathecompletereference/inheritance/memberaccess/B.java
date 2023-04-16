package org.example.javathecompletereference.inheritance.memberaccess;

// A's j is not accessible here.
public class B extends A{
    int total;
    void sum() {
        //total = i + j; // ERROR, j is not accessible here
    }

    /*
    This program will not compile because the use of j inside the sum( ) method of B causes
    an access violation. Since j is declared as private, it is only accessible by other members of its
    own class. Subclasses have no access to it
     */
}
