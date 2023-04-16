package org.example.javathecompletereference.inheritance.methodoverriding;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show(); // this calls show() in B overridden method.
        subOb.show("This is k: "); // this calls show() in B overloaded method.
    }
    /*
    When show( ) is invoked on an object of type B, the version of show( ) defined within B
    is used. That is, the version of show( ) inside B overrides the version declared in A
     */

    /*
    Method overriding occurs only when the names and the type signatures of the two
    methods are identical. If they are not, then the two methods are simply overloaded.
     */
}
