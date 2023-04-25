package org.example.javathecompletereference.multithreadedprogramming.deadlock;

/*
A special type of error that you need to avoid that relates specifically to multitasking is deadlock,
which occurs when two threads have a circular dependency on a pair of synchronized objects.
For example, suppose one thread enters the monitor on object X and another thread enters the
monitor on object Y. If the thread in X tries to call any synchronized method on Y, it will block
as expected. However, if the thread in Y, in turn, tries to call any synchronized method on X, the
thread waits forever, because to access X, it would have to release its own lock on Y
so that the first thread could complete. Deadlock is a difficult error to debug for two reasons:
•	 In general, it occurs only rarely, when the two threads time-slice in just the right way.
•	 It may involve more than two threads and two synchronized objects. (That is, deadlock
can occur through a more convoluted sequence of events than just described.)
 */
public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");
        try {
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println("A Interrupted");
        }
        System.out.println(name + " trying to call B.last()");
        b.last();
    }
    synchronized void last() {
        System.out.println("Inside A.last");
    }
}
