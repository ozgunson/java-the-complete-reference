package org.example.javathecompletereference.multithreadedprogramming.interthreadcommunication.incorrect;

public class Producer implements Runnable {
    Q q;
    Thread t;
    Producer(Q q) {
        this.q = q;
        t = new Thread(this, "Producer");
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
        }
    }

    /*
    Although wait( ) normally waits until notify( ) or
    notifyAll( ) is called, there is a possibility that in very rare cases the waiting thread could be
    awakened due to a spurious wakeup. In this case, a waiting thread resumes without notify( )
    or notifyAll( ) having been called. (In essence, the thread resumes for no apparent reason.)
    Because of this remote possibility, the Java API documentation recommends that calls to
    wait( ) should take place within a loop that checks the condition on which the thread is
    waiting.
     */
}
