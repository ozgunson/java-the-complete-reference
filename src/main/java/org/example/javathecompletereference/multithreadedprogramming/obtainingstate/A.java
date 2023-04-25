package org.example.javathecompletereference.multithreadedprogramming.obtainingstate;

public class A {
    /*
    As mentioned earlier in this chapter, a thread can exist in a number of different states. You
    can obtain the current state of a thread by calling the getState( ) method defined by Thread.
    It returns a value of type Thread.State that indicates the state of the thread at the time at
    which the call was made. State is an enumeration defined by Thread.

    Value                   State
    BLOCKED                 A thread that has suspended execution because it is waiting to acquire a lock.
    NEW                     A thread that has not begun execution.
    RUNNABLE                A thread that either is currently executing or will execute when it gains
                            access to the CPU.
    TERMINATED              A thread that has completed execution.
    TIMED_WAITING           A thread that has suspended execution for a specified period of time, such
                            as when it has called sleep( ). This state is also entered when a timeout
                            version of wait( ) or join( ) is called.
    WAITING                 A thread that has suspended execution because it is waiting for some
                            action to occur. For example, it is waiting because of a call to a non-timeout version of wait( ) or join( )
     */

    /*
    It is important to understand that a thread’s state may change after the call to getState( ).
    Thus, depending on the circumstances, the state obtained by calling getState( ) may not
    reflect the actual state of the thread only a moment later. For this (and other) reasons,
    getState( ) is not intended to provide a means of synchronizing threads. It’s primarily used
    for debugging or for profiling a thread’s run-time characteristics
     */
}
