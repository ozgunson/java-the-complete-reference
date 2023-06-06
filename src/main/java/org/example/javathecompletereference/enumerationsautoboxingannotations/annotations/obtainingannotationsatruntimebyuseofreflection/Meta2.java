package org.example.javathecompletereference.enumerationsautoboxingannotations.annotations.obtainingannotationsatruntimebyuseofreflection;

import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();
    int val();
}
public class Meta2 {
    // myMeth now has two arguments.
    @MyAnno2(str = "Two Parameters", val = 19)
    public static void myMeth(String str, int i)
    {
        Meta2 ob = new Meta2();
        try {
            Class<?> c = ob.getClass();
            // Here, the parameter types are specified.
            Method m = c.getMethod("myMeth", String.class, int.class);
            MyAnno2 anno = m.getAnnotation(MyAnno2.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String[] args) {
        myMeth("test", 10);
    }

    /*
    In this version, myMeth( ) takes a String and an int parameter. To obtain information
    about this method, getMethod( ) must be called as shown here:
    Method m = c.getMethod("myMeth", String.class, int.class);
    Here, the Class objects representing String and int are passed as additional arguments.
     */
}
