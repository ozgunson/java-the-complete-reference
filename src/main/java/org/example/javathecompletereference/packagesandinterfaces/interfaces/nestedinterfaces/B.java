package org.example.javathecompletereference.packagesandinterfaces.interfaces.nestedinterfaces;

public class B implements A.NestedInterface{
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }
}
