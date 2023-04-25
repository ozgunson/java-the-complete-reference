package org.example.javathecompletereference.packagesandinterfaces.interfaces.nestedinterfaces;

public class NestedInterfaceDemo {
    public static void main(String[] args) {
        // use a nested interface reference
        A.NestedInterface nestedInterface = new B();
        if(nestedInterface.isNotNegative(10)) {
            System.out.println("10 is not negative.");
        }
        if(nestedInterface.isNotNegative(-12)) {
            System.out.println("This won't be displayed.");
        }
    }
}
