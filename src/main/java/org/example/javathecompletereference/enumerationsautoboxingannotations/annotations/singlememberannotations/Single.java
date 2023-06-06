package org.example.javathecompletereference.enumerationsautoboxingannotations.annotations.singlememberannotations;

import java.lang.annotation.*;
import java.lang.reflect.*;
// A single-member annotation.
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
    int value(); // this variable name must be value
}
public class Single {
    // Annotate a method using a single-member annotation.
    @MySingle(100)
    public static void myMeth() {
        Single ob = new Single();
        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value()); // displays 100
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

    /*
    A single-member annotation contains only one member. It works like a normal annotation
    except that it allows a shorthand form of specifying the value of the member. When only one
    member is present, you can simply specify the value for that member when the annotation is
    applied—you don’t need to specify the name of the member. However, in order to use this
    shorthand, the name of the member must be value.


    You can use the single-value syntax when applying an annotation that has other members,
    but those other members must all have default values. For example, here the value xyz is
    added, with a default value of zero:
    @interface SomeAnno {
     int value();
     int xyz() default 0;
    }
    In cases in which you want to use the default for xyz, you can apply @SomeAnno, as shown
    next, by simply specifying the value of value by using the single-member syntax.
    @SomeAnno(88)
    In this case, xyz defaults to zero, and value gets the value 88. Of course, to specify a different
    value for xyz requires that both members be explicitly named, as shown here:
    @SomeAnno(value = 88, xyz = 99)
    Remember, whenever you are using a single-member annotation, the name of that member
    must be value.
     */
}
