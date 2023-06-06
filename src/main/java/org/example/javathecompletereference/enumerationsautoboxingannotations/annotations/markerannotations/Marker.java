package org.example.javathecompletereference.enumerationsautoboxingannotations.annotations.markerannotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
// A marker annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

/*
A marker annotation is a special kind of annotation that contains no members. Its sole
purpose is to mark an item. Thus, its presence as an annotation is sufficient. The best way to
determine if a marker annotation is present is to use the method isAnnotationPresent( ), which
is defined by the AnnotatedElement interface.
 */
public class Marker {
    // Annotate a method using a marker.
    // Notice that no ( ) is needed.
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            // Determine if the annotation is present.
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("MyMarker is present.");
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
