package org.example.javathecompletereference.multithreadedprogramming.creatingathread.implementingrunnable;

/*
You can construct a thread on any object that implements Runnable. To implement Runnable,
a class need only implement a single method called run( )

Inside run( ), you will define the code that constitutes the new thread. It is important to
understand that run( ) can call other methods, use other classes, and declare variables, just like
the main thread can. The only difference is that run( ) establishes the entry point for another,
concurrent thread of execution within your program. This thread will end when run( ) returns.


After you create a class that implements Runnable, you will instantiate an object of type
Thread from within that class. Thread defines several constructors. The one that we will use
is shown here:
Thread(Runnable threadOb, String threadName)
In this constructor, threadOb is an instance of a class that implements the Runnable interface.
This defines where execution of the thread will begin.

After the new thread is created, it will not start running until you call its start( ) method,
which is declared within Thread. In essence, start( ) initiates a call to run( )
 */
public class NewThread implements  Runnable {
    Thread t;
    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }
    // This is the entry point for the second thread.
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
}
