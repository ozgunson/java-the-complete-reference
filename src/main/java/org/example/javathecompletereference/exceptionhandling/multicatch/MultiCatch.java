package org.example.javathecompletereference.exceptionhandling.multicatch;

/*
The multi-catch feature allows two or more exceptions to be caught by the same catch
clause. It is not uncommon for two or more exception handlers to use the same code
sequence even though they respond to different exceptions. Instead of having to catch
each exception type individually, you can use a single catch clause to handle all of the
exceptions without code duplication.
To use a multi-catch, separate each exception type in the catch clause with the OR
operator. Each multi-catch parameter is implicitly final. (You can explicitly specify final,
if desired, but it is not necessary.) Because each multi-catch parameter is implicitly final, it
can’t be assigned a new value.
 */
public class MultiCatch {
    public static void main(String[] args) {
        int a=10, b=0;
        int[] vals = { 1, 2, 3 };
        try {
            int result = a / b; // generate an ArithmeticException
            // vals[10] = 19; // generate an ArrayIndexOutOfBoundsException
            // This catch clause catches both exceptions.
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("After multi-catch.");
    }
}
