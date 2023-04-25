package org.example.javathecompletereference.packagesandinterfaces.interfaces.defaultinterfacemethods;

public interface MyIF {
    // This is a "normal" interface method declaration.
    // It does NOT define a default implementation.
    int getNumber();
    // This is a default method. Notice that it provides
    // a default implementation.
    default String getString() {
        return "Default String";
    }

    /*
    The release of JDK 8 changed
    this by adding a new capability to interface called the default method. A default method lets
    you define a default implementation for an interface method. In other words, by use of a
    default method, it is possible for an interface method to provide a body, rather than being
    abstract. During its development, the default method was also referred to as an extension
    method, and you will likely see both terms used.
     */
}
