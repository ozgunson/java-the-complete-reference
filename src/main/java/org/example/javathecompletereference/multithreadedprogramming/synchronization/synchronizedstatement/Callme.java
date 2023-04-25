package org.example.javathecompletereference.multithreadedprogramming.synchronization.synchronizedstatement;

// This program uses a synchronized block.
public class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}
