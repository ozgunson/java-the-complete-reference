package org.example.javathecompletereference.multithreadedprogramming.interthreadcommunication.incorrect;

// an incorrect implementation of a producer and consumer.
public class Q {
    int n;
    synchronized int get() {
        System.out.println("Got: " + n);
        return n;
    }
    synchronized void put(int n) {
        this.n = n;
        System.out.println("Put: " + n);
    }
}
