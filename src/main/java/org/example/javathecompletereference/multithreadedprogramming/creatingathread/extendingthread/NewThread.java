package org.example.javathecompletereference.multithreadedprogramming.creatingathread.extendingthread;

public class NewThread extends Thread{
    NewThread() {
        // Create a new, second thread
        super("Demo Thread");
        System.out.println("Child thread: " + this);
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
     /*
    the child thread is created by instantiating an object of NewThread, which is derived from Thread.
    Notice the call to super( ) inside NewThread. This invokes the following form of the
    Thread constructor:
    public Thread(String threadName)


    The Thread class defines several methods that can be overridden by a derived class. Of these methods, the
    only one that must be overridden is run( ). This is, of course, the same method required when
    you implement Runnable. Many Java programmers feel that classes should be extended only
    when they are being enhanced or adapted in some way. So, if you will not be overriding any
    of Thread’s other methods, it is probably best simply to implement Runnable. Also, by
    implementing Runnable, your thread class does not need to inherit Thread, making it free to
    inherit a different class. Ultimately, which approach to use is up to you.
     */
}
