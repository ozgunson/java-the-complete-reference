package org.example.javathecompletereference.multithreadedprogramming.deadlock;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    Thread t;
    Deadlock() {
        Thread.currentThread().setName("MainThread");
        t = new Thread(this, "RacingThread");
    }
    void deadlockStart() {
        t.start();
        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }
    public void run() {
        b.bar(a); // get lock on b in other thread.
        System.out.println("Back in other thread");
    }
    public static void main(String[] args) {
        Deadlock dl = new Deadlock();

        dl.deadlockStart();
    }

    /*
    RacingThread owns the monitor on b, while it is waiting for the monitor on a. At the
    same time, MainThread owns a and is waiting to get b. This program will never complete.
    As this example illustrates, if your multithreaded program locks up occasionally, deadlock is
    one of the first conditions that you should check for
     */
}
