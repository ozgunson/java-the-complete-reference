package org.example.javathecompletereference.packagesandinterfaces.interfaces.variablesininterfaces;

public interface SharedConstants {
    int NO = 0;
    int YES = 1;
    int MAYBE = 2;
    int LATER = 3;
    int SOON = 4;
    int NEVER = 5;

    /*
    You can use interfaces to import shared constants into multiple classes by simply declaring
    an interface that contains variables that are initialized to the desired values.
    If an interface contains no methods, then any class that includes such an interface doesn’t actually implement
    anything. It is as if that class were importing the constant fields into the class name space as final variables.
     */
}
