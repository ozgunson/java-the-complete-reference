package org.example.javathecompletereference.methodsandclasses.variablelengtharguments;

// Varargs, overloading, and ambiguity.
//
// This program contains an error and will
// not compile!
public class VarArgs4 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): " +
                "Number of args: " + v.length +
                " Contents: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...) " +
                "Number of args: " + v.length +
                " Contents: ");
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK


        //vaTest(); // Error: Ambiguous!
        /*
        Because the vararg parameter can be empty, this call could be translated into a call to
        vaTest(int …) or vaTest(boolean …). Both are equally valid. Thus, the call is inherently
        ambiguous.
         */



        /*
        static void vaTest(int ... v) { // ...
        static void vaTest(int n, int ... v) { // ...
        Although the parameter lists of vaTest( ) differ, there is no way for the compiler to resolve
        the following call:
        vaTest(1)
         */
    }
}
