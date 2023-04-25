package org.example.javathecompletereference.exceptionhandling.usingtrycatch;
import java.util.Random;
// Handle an exception and move on.

public class HandleError {
    public static void main(String[] args) {
        int a=0, b=0, c=0;
        Random r = new Random();
        for(int i=0; i<32000; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b/c);
            } catch (ArithmeticException e) {
                /*Throwable overrides the toString( ) method (defined by Object) so that it returns a string containing a description
                 of the exception.You can display this description in a println( )statement by simply passing the exception as an argument. */
                // System.out.println("Exception: " + e);
                System.out.println("Division by zero.");
                a = 0; // set a to zero and continue
            }
            System.out.println("a: " + a);
        }
    }
}
