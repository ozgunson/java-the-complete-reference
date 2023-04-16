package org.example.javathecompletereference.inheritance.methodoverriding;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // display k - this override show() in A
    void show() {
        // super.show(); // this call's A's show()
        System.out.println("k: " + k);
    }
    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}
