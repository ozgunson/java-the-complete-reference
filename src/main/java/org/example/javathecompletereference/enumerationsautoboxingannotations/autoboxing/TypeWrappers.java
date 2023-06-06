package org.example.javathecompletereference.enumerationsautoboxingannotations.autoboxing;

public class TypeWrappers {

    /*
    primitive types, rather than objects, are used for these quantities for the sake of performance. Using objects for these values would an unacceptable overhead
    to even the simplest of calculations. Thus, the primitive types are not part of the object hierarchy, and they do not inherit Object.
    Despite the performance benefit offered by the primitive types, there are times when you
    will need an object representation. For example, you can’t pass a primitive type by reference
    to a method. Also, many of the standard data structures implemented by Java operate on
    objects, which means that you can’t use these data structures to store primitive types. To
    handle these (and other) situations, Java provides type wrappers, which are classes that
    encapsulate a primitive type within an object.
     */


    /*
    Character
    Character is a wrapper around a char. The constructor for Character is
    Character(char ch)
    Here, ch specifies the character that will be wrapped by the Character object being created.
    However, beginning with JDK 9, the Character constructor was deprecated, and beginning
    with JDK 16, it has been deprecated for removal. Today, it is strongly recommended that you
    use the static method valueOf( ) to obtain a Character object. It is shown here:
    static Character valueOf(char ch)
    It returns a Character object that wraps ch.
    To obtain the char value contained in a Character object, call charValue( ), shown here:
    char charValue( )
    It returns the encapsulated character

    Boolean
    Boolean is a wrapper around boolean values. It defines these constructors:
    Boolean(boolean boolValue)
    Boolean(String boolString)
    In the first version, boolValue must be either true or false. In the second version, if boolString
    contains the string "true" (in uppercase or lowercase), then the new Boolean object will be
    true. Otherwise, it will be false.
    However, beginning with JDK 9, the Boolean constructors were deprecated, and beginning
    with JDK 16, they have been deprecated for removal. Today, it is strongly recommended that
    you use the static method valueOf( ) to obtain a Boolean object. It has the two versions
    shown here:
    static Boolean valueOf(boolean boolValue)
    static Boolean valueOf(String boolString)
    Each returns a Boolean object that wraps the indicated value.
    To obtain a boolean value from a Boolean object, use booleanValue( ), shown here:
    boolean booleanValue( )
    It returns the boolean equivalent of the invoking object.

    The Numeric Type Wrappers
    By far, the most commonly used type wrappers are those that represent numeric values.
    These are Byte, Short, Integer, Long, Float, and Double. All of the numeric type wrappers
    inherit the abstract class Number. Number declares methods that return the value of an
    object in each of the different number formats. These methods are shown here:
    byte byteValue( )
    double doubleValue( )
    float floatValue( )
    int intValue( )
    long longValue( )
    short shortValue( )
    For example, doubleValue( ) returns the value of an object as a double, floatValue( )
    returns the value as a float, and so on. These methods are implemented by each of the
    numeric type wrappers.
    All of the numeric type wrappers define constructors that allow an object to be
    constructed from a given value, or a string representation of that value. For example,
    here are the constructors defined for Integer:
    Integer(int num)
    Integer(String str)
    If str does not contain a valid numeric value, then a NumberFormatException is thrown.
    However, beginning with JDK 9, the numeric type-wrapper constructors were deprecated,
    and beginning with JDK 16, they have been deprecated for removal. Today, it is strongly
    recommended that you use one of the valueOf( ) methods to obtain a wrapper object. The
    valueOf( ) method is a static member of all of the numeric wrapper classes and all numeric
    classes support forms that convert a numeric value or a string into an object. For example,
    here are two of the forms supported by Integer:
    static Integer valueOf(int val)
    static Integer valueOf(String valStr) throws NumberFormatException
    Here, val specifies an integer value and valStr specifies a string that represents a properly
    formatted numeric value in string form. Each returns an Integer object that wraps the
    specified value. Here is an example:
    Integer iOb = Integer.valueOf(100);
    After this statement executes, the value 100 is represented by an Integer instance. Thus,
    iOb wraps the value 100 within an object. In addition to the forms valueOf( ) just shown,
    the integer wrappers, Byte, Short, Integer, and Long, also supply a form that lets you
    specify a radix.
    All of the type wrappers override toString( ). It returns the human-readable form of the
    value contained within the wrapper. This allows you to output the value by passing a type
    wrapper object to println( ), for example, without having to convert it into its primitive type.
     */

    public static void main(String[] args) {

        // the process of encapsulating a value within an object is called boxing.
        Integer iob = Integer.valueOf(200);
        Boolean b = Boolean.valueOf("true");

        // the process of extracting a value from a type wrapper is called unboxing.
        int i = iob.intValue();
        double d = iob.doubleValue();

        Integer x = Integer.valueOf("500");

        System.out.println(i + " " + iob);
        System.out.println(d);
        System.out.println(x);
        System.out.println(b);

        b = false;
        System.out.println(b);
    }
}
