package org.example.javathecompletereference.enumerationsautoboxingannotations.autoboxing;

public class UnboxingError {
    public static void main(String[] args) {
        Integer iob = 1000; // autobox the value 1000

        int i = iob.byteValue(); // manually unbox as byte !!!

        System.out.println(i);

        // BAD USE OF AUTOBOXING / UNBOXING
        Double a, b, c;
        a = 10.0;
        b = 4.0;
        c = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse is " + c);

        /*
         Although this code is technically correct and does, in fact, work properly,
        it is a very bad use of autoboxing/unboxing. It is far less efficient than the equivalent code
        written using the primitive type double. The reason is that each autobox and auto-unbox
        adds overhead that is not present if the primitive type is used.
        In general, you should restrict your use of the type wrappers to only those cases in which
        an object representation of a primitive type is required. Autoboxing/unboxing was not added
        to Java as a “back door” way of eliminating the primitive types.
         */
    }
}
