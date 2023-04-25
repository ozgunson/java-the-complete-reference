package org.example.javathecompletereference.multithreadedprogramming.isaliveandjoin;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("One");
        NewThread nt2 = new NewThread("Two");
        NewThread nt3 = new NewThread("Three");
        // Start the threads.
        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        System.out.println("Thread One is alive: "
                + nt1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + nt2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + nt3.t.isAlive());
        // wait for threads to finish
        try {
            System.out.println("Waiting for threads to finish.");
            nt1.t.join();
            nt2.t.join();
            nt3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Thread One is alive: "
                + nt1.t.isAlive());
        System.out.println("Thread Two is alive: "
                + nt2.t.isAlive());
        System.out.println("Thread Three is alive: "
                + nt3.t.isAlive());
        System.out.println("Main thread exiting.");
    }

    /*
    As mentioned, often you will want the main thread to finish last. In the preceding examples,
    this is accomplished by calling sleep( ) within main( ), with a long enough delay to ensure
    that all child threads terminate prior to the main thread. However, this is hardly a
    satisfactory solution, and it also raises a larger question: How can one thread know when
    another thread has ended? Fortunately, Thread provides a means by which you can answer
    this question.
    Two ways exist to determine whether a thread has finished. First, you can call isAlive( )
    on the thread. This method is defined by Thread.
    The isAlive( ) method returns true if the thread upon which it is called is still running.
    It returns false otherwise.
    While isAlive( ) is occasionally useful, the method that you will more commonly use to
    wait for a thread to finish is called join( )

    This method waits until the thread on which it is called terminates. Its name comes from the
    concept of the calling thread waiting until the specified thread joins it. Additional forms of
    join( ) allow you to specify a maximum amount of time that you want to wait for the specified
    thread to terminate.
     */
}
