package org.example.javathecompletereference.packagesandinterfaces.interfaces.implementingandacessing;

public class AnotherClient implements Callback {
    // Implement Callback's interface
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is " + (p*p));
    }
}
