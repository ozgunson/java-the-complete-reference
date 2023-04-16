package org.example.javathecompletereference.inheritance.theobjectclass;

public class Main {
    /*
    There is one special class, Object, defined by Java. All other classes are subclasses of Object.
    That is, Object is a superclass of all other classes. This means that a reference variable of
    type Object can refer to an object of any other class. Also, since arrays are implemented as
    classes, a variable of type Object can also refer to any array.
     */

    public static void main(String[] args) {
        Object some = new Some(10);
    }
}
class Some {
    int a;
    Some(int a){
        this.a = a;
    }
}
