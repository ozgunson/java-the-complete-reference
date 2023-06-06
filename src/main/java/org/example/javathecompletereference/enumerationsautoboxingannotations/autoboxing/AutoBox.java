package org.example.javathecompletereference.enumerationsautoboxingannotations.autoboxing;

public class AutoBox {

    public static void main(String[] args) {
        Integer iOb = 100; // autobox an int
        int i = iOb; // auto-unbox
        System.out.println(i + " " + iOb); // displays 100 100
    }
}

/*
    Autoboxing
    Modern versions of Java have included two important features: autoboxing and auto-unboxing.
    Autoboxing is the process by which a primitive type is automatically encapsulated (boxed)
    into its equivalent type wrapper whenever an object of that type is needed. There is no need
    to explicitly construct an object. Auto-unboxing is the process by which the value of a boxed
    object is automatically extracted (unboxed) from a type wrapper when its value
    is needed. There is no need to call a method such as intValue( ) or doubleValue( ).
    Autoboxing and auto-unboxing greatly streamline the coding of several algorithms,
    removing the tedium of manually boxing and unboxing values. They also help prevent errors.
    Moreover, they are very important to generics, which operate only on objects. Finally,
    autoboxing makes working with the Collections Framework much easier.
    With autoboxing, it is not necessary to manually construct an object in order to wrap a
    primitive type. You need only assign that value to a type-wrapper reference. Java automatically
    constructs the object for you.
 */
