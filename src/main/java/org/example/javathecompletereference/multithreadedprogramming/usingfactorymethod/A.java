package org.example.javathecompletereference.multithreadedprogramming.usingfactorymethod;

/*
In some cases, it is not necessary to separate the creation of a thread from the start of its
execution. In other words, sometimes it is convenient to create and start a thread at the same
time. One way to do this is to use a static factory method. A factory method is a method that
returns an object of a class. Typically, factory methods are static methods of a class. They are
used for a variety of reasons, such as to set an object to some initial state prior to use, to
configure a specific type of object, or in some cases to enable an object to be reused. As it
relates to creating and starting a thread, a factory method will create the thread, call start( )
on the thread, and then return a reference to the thread. With this approach, you can create
and start a thread through a single method call, thus streamlining your code.
 */
public class A {
    /*
    // A factory method that creates and starts a thread.
    public static NewThread createAndStart() {
     NewThread myThrd = new NewThread();
     myThrd.t.start();
     return myThrd;
    }
     */


    /*
    USING MULTITHREADING

    The key to utilizing Java’s multithreading features effectively is to think concurrently rather
    than serially. For example, when you have two subsystems within a program that can execute
    concurrently, make them individual threads. With the careful use of multithreading, you
    can create very efficient programs. A word of caution is in order, however: If you create
    too many threads, you can actually degrade the performance of your program rather than
    enhance it. Remember, some overhead is associated with context switching. If you create too
    many threads, more CPU time will be spent changing contexts than executing your program!
     */
}
