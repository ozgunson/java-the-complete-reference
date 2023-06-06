package org.example.javathecompletereference.enumerationsautoboxingannotations.autoboxing;

// Autoboxing/unboxing takes place with
// method parameters and return values.
public class AutoBox2 {
    // Take an Integer parameter and return
    // an int value;
    static int m(Integer v) {
        return v ; // auto-unbox to int
    }
    public static void main(String[] args) {
        // Pass an int to m() and assign the return value
        // to an Integer. Here, the argument 100 is autoboxed
        // into an Integer. The return value is also autoboxed
        // into an Integer.
        Integer iOb = m(100);
        System.out.println(iOb);
    }
}

/*
In addition to the simple case of assignments, autoboxing automatically occurs whenever a
primitive type must be converted into an object; auto-unboxing takes place whenever an
object must be converted into a primitive type. Thus, autoboxing/unboxing might occur when
an argument is passed to a method, or when a value is returned by a method.
 */
