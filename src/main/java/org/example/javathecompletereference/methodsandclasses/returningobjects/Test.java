package org.example.javathecompletereference.methodsandclasses.returningobjects;

public class Test {
    int a;
    Test(int i) {
        a = i;
    }
    Test incrByTen() {
        Test temp = new Test(a+10);
        return temp;
    }
}
