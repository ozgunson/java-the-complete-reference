package org.example.javathecompletereference.multithreadedprogramming.threadpriorities;

public class ThreadPriority {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println(t.getPriority());
        t.setPriority(10);
        System.out.println(t.getPriority());
    }
}
