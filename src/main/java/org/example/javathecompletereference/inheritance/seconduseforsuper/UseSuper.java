package org.example.javathecompletereference.inheritance.seconduseforsuper;

public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);
        subOb.show();
    }

    /* Although the instance variable i in B hides the i in A, super allows access to the i defined
        in the superclass. As you will see, super can also be used to call methods that are hidden
        by a subclass.     */
}
