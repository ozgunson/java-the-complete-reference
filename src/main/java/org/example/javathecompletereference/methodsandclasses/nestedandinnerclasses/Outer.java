package org.example.javathecompletereference.methodsandclasses.nestedandinnerclasses;

public class Outer {
    int outer_x = 100;
    void test() {
        Inner inner = new Inner();
        inner.display();
    }
    // this is an inner class
    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }

    // define an inner class within a for loop.
    void test2() {
        for(int i=0; i<10; i++){
            class Inner2 {
                void display2() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }

    /*
    void showy() {
        System.out.println(y); // error, y not known here!
    }
     */

}
