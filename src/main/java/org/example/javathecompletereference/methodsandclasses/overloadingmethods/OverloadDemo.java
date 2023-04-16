package org.example.javathecompletereference.methodsandclasses.overloadingmethods;

public class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }
    // Overload test for one integer parameter.
    void test(int a) {
        System.out.println("a: " + a);
    }
    // Overload test for two integer parameters.
    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }
    // Overload test for a double parameter
    double test(double a) {
        System.out.println("double a: " + a);
        return a*a;
    }

    // When an overloaded method is called, Java looks for a match between the arguments
    //used to call the method and the method’s parameters. However, this match need not always
    //be exact. In some cases, Java’s automatic type conversions can play a role in overload
    //resolution.
}
