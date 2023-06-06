package org.example.javathecompletereference.enumerationsautoboxingannotations.enumerations.inherit;

/*
Although you can’t inherit a superclass when declaring an enum, all enumerations
automatically inherit one: java.lang.Enum. This class defines several methods that are
available for use by all enumerations.
You can obtain a value that indicates an enumeration constant’s position in the list of
constants. This is called its ordinal value, and it is retrieved by calling the ordinal( ) method,
shown here:
final int ordinal( )
It returns the ordinal value of the invoking constant. Ordinal values begin at zero. Thus, in
the Apple enumeration, Jonathan has an ordinal value of zero, GoldenDel has an ordinal
value of 1, RedDel has an ordinal value of 2, and so on.
You can compare the ordinal value of two constants of the same enumeration by using
the compareTo( ) method. It has this general form:
final int compareTo(enum-type e)
Here, enum-type is the type of the enumeration, and e is the constant being compared to
the invoking constant. Remember, both the invoking constant and e must be of the same
enumeration. If the invoking constant has an ordinal value less than e’s, then compareTo( )
returns a negative value. If the two ordinal values are the same, then zero is returned. If the
invoking constant has an ordinal value greater than e’s, then a positive value is returned.
You can compare for equality an enumeration constant with any other object by using
equals( ), which overrides the equals( ) method defined by Object. Although equals( ) can
compare an enumeration constant to any other object, those two objects will be equal only if
they both refer to the same constant, within the same enumeration. Simply having ordinal
values in common will not cause equals( ) to return true if the two constants are from
different enumerations.
Remember, you can compare two enumeration references for equality by using = =.
 */
public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        // Obtain all ordinal values using ordinal().
        System.out.println("Here are all apple constants" +
                " and their ordinal values: ");
        for(Apple a : Apple.values())
            System.out.println(a + " " + a.ordinal());
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();
        // Demonstrate compareTo() and equals()
        if(ap.compareTo(ap2) < 0)
            System.out.println(ap + " comes before " + ap2);
        if(ap.compareTo(ap2) > 0)
            System.out.println(ap2 + " comes before " + ap);
        if(ap.compareTo(ap3) == 0)
            System.out.println(ap + " equals " + ap3);
        System.out.println();
        if(ap.equals(ap2))
            System.out.println("Error!");
        if(ap.equals(ap3))
            System.out.println(ap + " equals " + ap3);
        if(ap == ap3)
            System.out.println(ap + " == " + ap3);
    }
}
