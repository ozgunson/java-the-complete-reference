package org.example.javathecompletereference.packagesandinterfaces.interfaces.extendedinterfaces;

public class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }

    /*
    As an experiment, you might want to try removing the implementation for meth1( ) in
    MyClass. This will cause a compile-time error. As stated earlier, any class that implements
    an interface must implement all methods required by that interface, including any that are
    inherited from other interfaces.
     */
}
