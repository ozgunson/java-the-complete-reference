package org.example.javathecompletereference.exceptionhandling.uncheckedexceptions;

import org.example.javathecompletereference.datatypesvariablesandarrays.arrays.Array;

public class ArrayStore {
    public static void main(String[] args) {

        Object[] myObjects = new Integer[5];
        try {
            myObjects[0] = "Selim";
            System.out.println(myObjects[0]);
        }catch (ArrayStoreException e) {
            System.out.println(e.getMessage());
        }

        String name = "Ozgun";
        try {
            char x = name.charAt(20);
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    /*
    UnCheckedExceptions
    Exception                                  Meaning
    ArithmeticException             Arithmetic error, such as divide-by-zero.
    ArrayIndexOutOfBoundsException  Array index is out-of-bounds.
    ArrayStoreException             Assignment to an array element of an incompatible type.
    ClassCastException              Invalid cast.
    EnumConstantNotPresentException An attempt is made to use an undefined enumeration value.
    IllegalArgumentException        Illegal argument used to invoke a method.
    IllegalCallerException          A method cannot be legally executed by the calling code.
    IllegalMonitorStateException    Illegal monitor operation, such as waiting on an unlocked thread.
    IllegalStateException           Environment or application is in incorrect state.
    IllegalThreadStateException     Requested operation not compatible with current thread state.
    IndexOutOfBoundsException       Some type of index is out-of-bounds.
    LayerInstantiationException     A module layer cannot be created.
    NegativeArraySizeException      Array created with a negative size.
    NullPointerException            Invalid use of a null reference.
    NumberFormatException           Invalid conversion of a string to a numeric format.
    SecurityException               Attempt to violate security.
    StringIndexOutOfBoundsException Attempt to index outside the bounds of a string.
    TypeNotPresentException         Type not found.
    UnsupportedOperationException   An unsupported operation was encountered

    Checked Exceptions
    Exception                                   Meaning
    ClassNotFoundException          Class not found.
    CloneNotSupportedException      Attempt to clone an object that does not implement
    the Cloneable interface.
    IllegalAccessException          Access to a class is denied.
    InstantiationException          Attempt to create an object of an abstract class or interface.
    InterruptedException            One thread has been interrupted by another thread.
    NoSuchFieldException            A requested field does not exist.
    NoSuchMethodException           A requested method does not exist.
    ReflectiveOperationException    Superclass of reflection-related exceptions.
     */
}
