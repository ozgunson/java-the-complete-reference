package org.example.javathecompletereference.inheritance.memberaccess;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
