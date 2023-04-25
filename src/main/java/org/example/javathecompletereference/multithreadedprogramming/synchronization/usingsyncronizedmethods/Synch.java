package org.example.javathecompletereference.multithreadedprogramming.synchronization.usingsyncronizedmethods;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");
        // Start the threads.
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();
        // wait for threads to end
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    /* synchronization
    When two or more threads need access to a shared resource, they need some way to ensure
    that the resource will be used by only one thread at a time. The process by which this is
    achieved is called synchronization. As you will see, Java provides unique, language-level
    support for it.

    Key to synchronization is the concept of the monitor. A monitor is an object that is used
    as a mutually exclusive lock. Only one thread can own a monitor at a given time. When a
    thread acquires a lock, it is said to have entered the monitor. All other threads attempting to
    enter the locked monitor will be suspended until the first thread exits the monitor. These
    other threads are said to be waiting for the monitor. A thread that owns a monitor can
    reenter the same monitor if it so desires.
    You can synchronize your code in either of two ways. Both involve the use of the
    synchronized keyword
     */
}
