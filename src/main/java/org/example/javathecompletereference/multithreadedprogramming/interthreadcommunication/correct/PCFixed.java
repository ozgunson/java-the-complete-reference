package org.example.javathecompletereference.multithreadedprogramming.interthreadcommunication.correct;

public class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);
        // Start the threads.
        p.t.start();
        c.t.start();
        System.out.println("Press Control-C to stop.");
    }

    /*
    Inside get( ), wait( ) is called. This causes its execution to suspend until Producer notifies you
    that some data is ready. When this happens, execution inside get( ) resumes. After the data
    has been obtained, get( ) calls notify( ). This tells Producer that it is okay to put more data in
    the queue. Inside put( ), wait( ) suspends execution until Consumer has removed the item
    from the queue. When execution resumes, the next item of data is put in the queue, and
    notify( ) is called. This tells Consumer that it should now remove it.
     */
}
