package org.example.javathecompletereference.enumerationsautoboxingannotations.enumerations;

public class EnumDemo2 {
    public static void main(String[] args)
    {
        Apple ap;
        System.out.println("Here are all Apple constants:");
        // use values()
        Apple[] allapples = Apple.values();
        for(Apple a : allapples)
            System.out.println(a);
        System.out.println();
        // use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }

    /*
    The values( ) method returns an array that contains a list of the enumeration constants. The
    valueOf( ) method returns the enumeration constant whose value corresponds to the string
    passed in str. In both cases, enum-type is the type of the enumeration. For example, in the
    case of the Apple enumeration shown earlier, the return type of Apple.valueOf("Winesap")
    is Winesap.
     */
}
