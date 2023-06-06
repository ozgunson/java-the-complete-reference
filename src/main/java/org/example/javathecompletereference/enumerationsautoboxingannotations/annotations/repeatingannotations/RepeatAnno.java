package org.example.javathecompletereference.enumerationsautoboxingannotations.annotations.repeatingannotations;

// Demonstrate a repeated annotation.
import java.lang.annotation.*;
import java.lang.reflect.*;
// Make MyAnno repeatable.
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}
// This is the container annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}
public class RepeatAnno {
    // Repeat MyAnno on myMeth().
    @MyAnno(str = "First annotation", val = -1)
    @MyAnno(str = "Second annotation", val = 100)
    public static void myMeth(String str, int i)
    {
        RepeatAnno ob = new RepeatAnno();
        try {
            Class<?> c = ob.getClass();
            // Obtain the annotations for myMeth().
            Method m = c.getMethod("myMeth", String.class, int.class);
            // Display the repeated MyAnno annotations.
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String[] args) {
        myMeth("test", 10);
    }

    /*
    SOME RESTRICTIONS
    There are a number of restrictions that apply to annotation declarations. First, no annotation
    can inherit another. Second, all methods declared by an annotation must be without parameters.
    Furthermore, they must return one of the following:
    •	 A primitive type, such as int or double
    •	 An object of type String or Class
    •	 An object of an enum type
    •	 An object of another annotation type
    •	 An array of a legal type.
    Annotations cannot be generic. In other words, they cannot take type parameters.
    Finally, annotation methods cannot specify a throws clause.
     */
}
