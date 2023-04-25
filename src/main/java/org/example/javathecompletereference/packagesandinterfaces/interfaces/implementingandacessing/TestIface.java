package org.example.javathecompletereference.packagesandinterfaces.interfaces.implementingandacessing;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
