package org.example.javathecompletereference.enumerationsautoboxingannotations.enumerations;

/*
a Java enumeration is a class type. Although you don’t instantiate an enum
using new, it otherwise has much the same capabilities as other classes. The fact that enum
defines a class gives the Java enumeration extraordinary power. For example, you can give
them constructors, add instance variables and methods, and even implement interfaces.
It is important to understand that each enumeration constant is an object of its
enumeration type. Thus, when you define a constructor for an enum, the constructor is
called when each enumeration constant is created. Also, each enumeration constant has its
own copy of any instance variables defined by the enumeration.
 */

// Use an enum constructor, instance variable, and method.
public enum NewApple {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(20), Cortland(15), Blue, Mac;

    private int price; // price of each apple

    // constructor
    NewApple(int p) {
        price = p;
    }

    NewApple() {
        price = 10;
    }
    int getPrice() {
        return price;
    }
}
