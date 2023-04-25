package org.example.javathecompletereference.multithreadedprogramming.interthreadcommunication.incorrect;

public class PC {
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
    Although the put( ) and get( ) methods on Q are synchronized, nothing stops the producer
    from overrunning the consumer, nor will anything stop the consumer from consuming the
    same queue value twice. Thus, you get the erroneous output shown here (the exact output
    will vary with processor speed and task load):
     */


    /*
    multithreading replaces event loop programming by dividing your
    tasks into discrete, logical units. Threads also provide a secondary benefit: they do away
    with polling. Polling is usually implemented by a loop that is used to check some condition
    repeatedly. Once the condition is true, appropriate action is taken. This wastes CPU time.
    For example, consider the classic queuing problem, where one thread is producing some
    data and another is consuming it. To make the problem more interesting, suppose that the
    producer has to wait until the consumer is finished before it generates more data. In a polling
    system, the consumer would waste many CPU cycles while it waited for the producer to
    produce. Once the producer was finished, it would start polling, wasting more CPU cycles
    waiting for the consumer to finish, and so on. Clearly, this situation is undesirable.

    To avoid polling, Java includes an elegant interprocess communication mechanism via
    the wait( ), notify( ), and notifyAll( ) methods. These methods are implemented as final
    methods in Object, so all classes have them. All three methods can be called only from
    within a synchronized context. Although conceptually advanced from a computer science
    perspective, the rules for using these methods are actually quite simple:
    •	 wait( ) tells the calling thread to give up the monitor and go to sleep until some other
    thread enters the same monitor and calls notify( ) or notifyAll( ).
    •	 notify( ) wakes up a thread that called wait( ) on the same object.
    •	 notifyAll( ) wakes up all the threads that called wait( ) on the same object. One of
    the threads will be granted access
     */
}
