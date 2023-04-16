package org.example.javathecompletereference.methodsandclasses.statickeyword;

// Demonstrate static variables, methods, and blocks.
public class UseStatic {
    static int a = 3;
    static int b;
    static void meth(int x) {
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    public static void main(String[] args) {
        meth(42);
    }

    /*
    When a member is declared static, it can be accessed
    before any objects of its class are created, and without reference to any object. You can declare
    both methods and variables to be static.
    The most common example of a static member is
    main( ). main( ) is declared as static because it must be called before any objects exist.
    Instance variables declared as static are, essentially, global variables. When objects of
    its class are declared, no copy of a static variable is made. Instead, all instances of the class
    share the same static variable.



    Methods declared as static have several restrictions:
•	 They can only directly call other static methods of their class.
•	 They can only directly access static variables of their class.
•	 They cannot refer to this or super in any way
     */
}
