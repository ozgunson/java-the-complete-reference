package org.example.javathecompletereference.multithreadedprogramming.suspendingresumingandstopping;

public class SuspendResume {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        ob1.t.start(); // Start the thread
        ob2.t.start(); // Start the thread
        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Suspending thread One");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resuming thread One");
            ob2.mysuspend();
            System.out.println("Suspending thread Two");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resuming thread Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }

    /*
    Although these methods seem to be a
    perfectly reasonable and convenient approach to managing the execution of threads, they
    must not be used for new Java programs. Here’s why. The suspend( ) method of the Thread
    class was deprecated by Java 2 several years ago. This was done because suspend( ) can
    sometimes cause serious system failures. Assume that a thread has obtained locks on
    critical data structures. If that thread is suspended at that point, those locks are not
    relinquished. Other threads that may be waiting for those resources can be deadlocked.
    The resume( ) method is also deprecated. It does not cause problems, but cannot be
    used without the suspend( ) method as its counterpart.
    The stop( ) method of the Thread class, too, was deprecated by Java 2. This was done
    because this method can sometimes cause serious system failures. Assume that a thread is
    writing to a critically important data structure and has completed only part of its changes.
    If that thread is stopped at that point, that data structure might be left in a corrupted state.
    The trouble is that stop( ) causes any lock the calling thread holds to be released. Thus, the
    corrupted data might be used by another thread that is waiting on the same lock.
    Because you can’t now use the suspend( ), resume( ), or stop( ) methods to control a
    thread,


    you might be thinking that no way exists to pause, restart, or terminate a thread. But,
    fortunately, this is not true. Instead, a thread must be designed so that the run( ) method
    periodically checks to determine whether that thread should suspend, resume, or stop its
    own execution. Typically, this is accomplished by establishing a flag variable that indicates
    the execution state of the thread. As long as this flag is set to “running,” the run( ) method
    must continue to let the thread execute. If this variable is set to “suspend,” the thread must
    pause. If it is set to “stop,” the thread must terminate. Of course, a variety of ways exist in
    which to write such code, but the central theme will be the same for all programs.
    The following example illustrates how the wait( ) and notify( ) methods that are inherited
    from Object can be used to control the execution of a thread. Let us consider its operation.
    The NewThread class contains a boolean instance variable named suspendFlag, which is
    used to control the execution of the thread. It is initialized to false by the constructor. The
    run( ) method contains a synchronized statement block that checks suspendFlag. If that
    variable is true, the wait( ) method is invoked to suspend the execution of the thread. The
    mysuspend( ) method sets suspendFlag to true. The myresume( ) method sets suspendFlag
    to false and invokes notify( ) to wake up the thread. Finally, the main( ) method has been
    modified to invoke the mysuspend( ) and myresume( ) methods
     */
}
