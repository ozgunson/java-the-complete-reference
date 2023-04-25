package org.example.javathecompletereference.exceptionhandling.throwstatement;

/*
So far, you have only been catching exceptions that are thrown by the Java run-time system.
However, it is possible for your program to throw an exception explicitly, using the throw
statement.
 */
// Demonstrate throw
public class ThrowDemo {
    /*
    There are two ways you can obtain a Throwable
    object: using a parameter in a catch clause or creating one with the new operator.
     */
    static void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch(NullPointerException e) {
            System.out.println("Caught inside demoproc.");
            throw e; // rethrow the exception
        }
    }
    public static void main(String[] args) {
        try {
            demoproc();
        } catch(NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
    /*
    This program gets two chances to deal with the same error. First, main( ) sets up
    an exception context and then calls demoproc( ). The demoproc( ) method then sets
    up another exception-handling context and immediately throws a new instance of
    NullPointerException, which is caught on the next line. The exception is then rethrown.
     */

    /*
    Here, new is used to construct an instance of NullPointerException. Many of Java’s built-in
    run-time exceptions have at least two constructors: one with no parameter and one that takes a
    string parameter. When the second form is used, the argument specifies a string that describes
    the exception. This string is displayed when the object is used as an argument to print( ) or
    println( ). It can also be obtained by a call to getMessage( ), which is defined by Throwable.
     */
}
