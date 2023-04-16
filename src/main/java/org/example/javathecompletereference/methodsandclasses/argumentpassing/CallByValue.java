package org.example.javathecompletereference.methodsandclasses.argumentpassing;

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 15, b = 20;
        System.out.println("a and b before call: " +
                a + " " + b);
        ob.meth(a, b);
        System.out.println("a and b after call: " +
                a + " " + b);
    }

    //As you can see, the operations that occur inside meth( ) have no effect on the values of a and
    //b used in the call; their values here did not change to 30 and 10
}
