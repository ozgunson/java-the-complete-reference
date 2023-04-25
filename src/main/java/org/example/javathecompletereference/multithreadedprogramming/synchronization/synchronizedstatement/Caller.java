package org.example.javathecompletereference.multithreadedprogramming.synchronization.synchronizedstatement;

public class Caller implements Runnable {
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }
    // synchronize calls to call()
    public void run() {
        synchronized(target) { // synchronized block
            target.call(msg);
        }
    }

    /*
    Here, the call( ) method is not modified by synchronized. Instead, the synchronized
    statement is used inside Caller’s run( ) method. This causes the same correct output as the
    preceding example, because each thread waits for the prior one to finish before proceeding.
     */
}
