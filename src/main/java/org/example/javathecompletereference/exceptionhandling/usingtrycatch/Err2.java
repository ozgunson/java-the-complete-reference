package org.example.javathecompletereference.exceptionhandling.usingtrycatch;

public class Err2 {
    public static void main(String[] args) {
        int d, a;
        try { // monitor a block of code.
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed.");
        } catch (ArithmeticException e) { // catch divide-by-zero error
            System.out.println("Division by zero.");
        }
        System.out.println("After catch statement.");
    }
    /*
    Once an exception
    is thrown, program control transfers out of the try block into the catch block. Put differently,
    catch is not “called,” so execution never “returns” to the try block from a catch. Thus, the
    line "This will not be printed." is not displayed. Once the catch statement has executed,
    program control continues with the next line in the program following the entire try / catch
    mechanism
     */

    /*
    A try and its catch statement form a unit. The scope of the catch clause is restricted to
    those statements specified by the immediately preceding try statement. A catch statement
    cannot catch an exception thrown by another try statement (except in the case of nested
    try statements, described shortly). The statements that are protected by try must be
    surrounded by curly braces. (That is, they must be within a block.) You cannot use try on
    a single statement.
     */
}
