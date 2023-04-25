package org.example.javathecompletereference.multithreadedprogramming.mainthread;

// controlling the main thread.
public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        // change the name of the thread
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        try {
            for(int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000); // suspend execution This method may throw an InterruptedException
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }

    /*
    When a Java program starts up, one thread begins running immediately. This is usually
    called the main thread of your program, because it is the one that is executed when your
    program begins. The main thread is important for two reasons:
    •	 It is the thread from which other “child” threads will be spawned.
    •	 Often, it must be the last thread to finish execution because it performs various
    shutdown actions.


    Although the main thread is created automatically when your program is started, it
    can be controlled through a Thread object. To do so, you must obtain a reference to it by
    calling the method currentThread( ), which is a public static member of Thread.
     */


    /*
    Notice the output produced when t is used as an argument to println( ). This displays, in
    order: the name of the thread, its priority, and the name of its group. By default, the name of
    the main thread is main. Its priority is 5, which is the default value, and main is also the name
    of the group of threads to which this thread belongs. A thread group is a data structure that
    controls the state of a collection of threads as a whole. After the name of the thread is changed,
    t is again output. This time, the new name of the thread is displayed
     */
}
