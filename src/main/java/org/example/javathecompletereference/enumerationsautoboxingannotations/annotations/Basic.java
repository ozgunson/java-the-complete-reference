package org.example.javathecompletereference.enumerationsautoboxingannotations.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
Java provides a feature that enables you to embed supplemental information into a source file.
This information, called an annotation, does not change the actions of a program. Thus, an
annotation leaves the semantics of a program unchanged. However, this information can be
used by various tools during both development and deployment. For example, an annotation
might be processed by a source-code generator. The term metadata is also used to refer to
this feature, but the term annotation is the most descriptive and more commonly used.
 */
public class Basic {

    @interface MyAnno {
        String str();
        int val();
    }

    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {}

    /*
    This annotation is linked with the method myMeth( ). Look closely at the annotation syntax.
    The name of the annotation, preceded by an @, is followed by a parenthesized list of member
    initializations. To give a member a value, that member’s name is assigned a value. Therefore,
    in the example, the string "Annotation Example" is assigned to the str member of MyAnno.
    Notice that no parentheses follow str in this assignment. When an annotation member is
    given a value, only its name is used. Thus, annotation members look like fields in this context.
     */

    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnno2 {
        String str();
        int val();
    }

    /*
    Specifying a Retention Policy
    Before exploring annotations further, it is necessary to discuss annotation retention policies.
    A retention policy determines at what point an annotation is discarded. Java defines three
    such policies, which are encapsulated within the java.lang.annotation.RetentionPolicy
    enumeration. They are SOURCE, CLASS, and RUNTIME.

    An annotation with a retention policy of SOURCE is retained only in the source file and
    is discarded during compilation.
    An annotation with a retention policy of CLASS is stored in the .class file during
    compilation. However, it is not available through the JVM during run time.
    An annotation with a retention policy of RUNTIME is stored in the .class file during
    compilation and is available through the JVM during run time. Thus, RUNTIME retention
    offers the greatest annotation persistence
     */

}

/*
First, notice the @ that precedes the keyword interface. This tells the compiler that
an annotation type is being declared. Next, notice the two members str( ) and val( ). All
annotations consist solely of method declarations. However, you don’t provide bodies for
these methods. Instead, Java implements these methods. Moreover, the methods act much
like fields, as you will see.
An annotation cannot include an extends clause. However, all annotation types
automatically extend the Annotation interface. Thus, Annotation is a super-interface of all
annotations. It is declared within the java.lang.annotation package. It overrides hashCode( ),
equals( ), and toString( ), which are defined by Object. It also specifies annotationType( ),
which returns a Class object that represents the invoking annotation.

Once you have declared an annotation, you can use it to annotate something. Initially,
annotations could be used only on declarations, and that is where we will begin. (JDK 8
added the ability to annotate type use, and this is described later in this chapter. However,
the same basic techniques apply to both kinds of annotations.) Any type of declaration can
have an annotation associated with it. For example, classes, methods, fields, parameters, and
enum constants can be annotated. Even an annotation can be annotated. In all cases, the
annotation precedes the rest of the declaration.
 */