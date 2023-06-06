package org.example.javathecompletereference.enumerationsautoboxingannotations.annotations.obtainingannotationsatruntimebyuseofreflection;

import java.lang.annotation.*;
import java.lang.reflect.*;
// An annotation type declaration.
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

public class Meta {
    // Annotate a method.
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();
        // Obtain the annotation for this method
        // and display the values of the members.
        try {
            // First, get a Class object that represents
            // this class.
            Class<?> c = ob.getClass();
            // Now, get a Method object that represents
            // this method.
            Method m = c.getMethod("myMeth");
            // Next, get the annotation for this class.
            MyAnno anno = m.getAnnotation(MyAnno.class);
            // Finally, display the values.
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found.");
        }
    }
    public static void main(String[] args) {
        myMeth();
    }

    /*
    This program uses reflection as described to obtain and display the values of str and val
    in the MyAnno annotation associated with myMeth( ) in the Meta class. There are two
    things to pay special attention to. First, in this line
    MyAnno anno = m.getAnnotation(MyAnno.class);
    notice the expression MyAnno.class. This expression evaluates to a Class object of type
    MyAnno, the annotation. This construct is called a class literal. You can use this type of
    expression whenever a Class object of a known class is needed. For example, this statement
    could have been used to obtain the Class object for Meta:
    Class<?> c = Meta.class;
    Of course, this approach only works when you know the class name of an object in advance,
    which might not always be the case. In general, you can obtain a class literal for classes,
    interfaces, primitive types, and arrays.
    The second point of interest is the way the values associated with str and val are obtained
    when they are output by the following line:
    System.out.println(anno.str() + " " + anno.val());
    Notice that they are invoked using the method-call syntax. This same approach is used
    whenever the value of an annotation member is required.
     */
}
