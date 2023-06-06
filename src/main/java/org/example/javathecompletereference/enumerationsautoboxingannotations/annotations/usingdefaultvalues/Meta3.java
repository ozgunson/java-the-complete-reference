package org.example.javathecompletereference.enumerationsautoboxingannotations.annotations.usingdefaultvalues;

import java.lang.annotation.*;
import java.lang.reflect.*;
// An annotation type declaration that includes defaults.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Testing";
    int val() default 9000;
}

/*
This declaration gives a default value of "Testing" to str and 9000 to val. This means that
neither value needs to be specified when @MyAnno is used. However, either or both can be
given values if desired. Therefore, following are the four ways that @MyAnno can be used:
@MyAnno() // both str and val default
@MyAnno(str = "some string") // val defaults
@MyAnno(val = 100) // str defaults
@MyAnno(str = "Testing", val = 100) // no defaults
 */
public class Meta3 {
    // Annotate a method using the default values.
    @MyAnno()
    public static void myMeth() {
        Meta3 ob = new Meta3();
        // Obtain the annotation for this method
        // and display the values of the members.
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }
}
