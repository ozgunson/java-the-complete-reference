package org.example.javathecompletereference.exceptionhandling.chainedexceptions;

/*
The chained exception feature allows you to associate another exception with an
exception. This second exception describes the cause of the first exception.

The getCause( ) method returns the exception that underlies the current exception.
If there is no underlying exception, null is returned. The initCause( ) method associates
causeExc with the invoking exception and returns a reference to the exception. Thus, you can
associate a cause with an exception after the exception has been created. However, the cause
exception can be set only once. This means that you can call initCause( ) only once for each
exception object. Furthermore, if the cause exception was set by a constructor, then you can’t
set it again using initCause( ).
 */
public class ChainExcDemo {
    static void demoproc() {
        // create an exception
        NullPointerException e =
                new NullPointerException("top layer");
        // add a cause
        e.initCause(new ArithmeticException("cause"));
        throw e;
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            // display top level exception
            System.out.println("Caught: " + e);
            // display cause exception
            System.out.println("Original cause: " +
                    e.getCause());
        }
    }

    /*
    In this example, the top-level exception is NullPointerException. To it is added a cause
    exception, ArithmeticException. When the exception is thrown out of demoproc( ), it is
    caught by main( ). There, the top-level exception is displayed, followed by the underlying
    exception, which is obtained by calling getCause( ).
    Chained exceptions can be carried on to whatever depth is necessary. Thus, the cause
    exception can, itself, have a cause. Be aware that overly long chains of exceptions may
    indicate poor design.
    Chained exceptions are not something that every program will need. However, in cases
    in which knowledge of an underlying cause is useful, they offer an elegant solution
     */
}
