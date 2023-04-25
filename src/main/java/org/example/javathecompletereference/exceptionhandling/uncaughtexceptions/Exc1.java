package org.example.javathecompletereference.exceptionhandling.uncaughtexceptions;

public class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10 / d;
    }
    public static void main(String[] args) {
        Exc1.subroutine();
    }

    /*
    Also, notice that the type of
    exception thrown is a subclass of Exception called ArithmeticException, which more
    specifically describes what type of error happened. As discussed later in this chapter, Java
    supplies several built-in exception types that match the various sorts of run-time errors that
    can be generated.
     */
    /*
    As you can see, the bottom of the stack is main’s line 9, which is the call to subroutine( ),
    which caused the exception at line 6. The call stack is quite useful for debugging, because it
    pinpoints the precise sequence of steps that led to the error.
     */
}
