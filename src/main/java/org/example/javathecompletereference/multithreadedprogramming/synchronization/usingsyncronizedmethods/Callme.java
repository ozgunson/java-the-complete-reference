package org.example.javathecompletereference.multithreadedprogramming.synchronization.usingsyncronizedmethods;

// This program is not synchronized.
public class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
    /*
    As you can see, by calling sleep( ), the call( ) method allows execution to switch to another
    thread. This results in the mixed-up output of the three message strings. In this program,
    nothing exists to stop all three threads from calling the same method, on the same object, at
    the same time. This is known as a race condition, because the three threads are racing each
    other to complete the method. This example used sleep( ) to make the effects repeatable and
    obvious. In most situations, a race condition is more subtle and less predictable, because
    you can’t be sure when the context switch will occur. This can cause a program to run right
    one time and wrong the next.

    To fix the preceding program, you must serialize access to call( ). That is, you must
    restrict its access to only one thread at a time. To do this, you simply need to precede call( )’s
    definition with the keyword synchronized,
    */

//    synchronized void call(String msg) {
//        System.out.print("[" + msg);
//        try {
//            Thread.sleep(1000);
//        } catch(InterruptedException e) {
//            System.out.println("Interrupted");
//        }
//        System.out.println("]");
//    }

    //  This prevents other threads from entering call( ) while another thread is using it.
}
