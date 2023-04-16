package org.example.javathecompletereference.methodsandclasses.argumentpassing;

// Primitive types are passed by value.
public class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
    int a, b;
    Test() {
    }
    Test(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
