package org.example.javathecompletereference.packagesandinterfaces.packagesandmemberaccess.p2;

public class OtherPackage {
    OtherPackage() {
        org.example.javathecompletereference.packagesandinterfaces.packagesandmemberaccess.p1.Protection p =
                new org.example.javathecompletereference.packagesandinterfaces.packagesandmemberaccess.p1.Protection();
        System.out.println("other package constructor");
    // class or package only
    // System.out.println("n = " + p.n);
    // class only
    // System.out.println("n_pri = " + p.n_pri);
    // class, subclass or package only
    // System.out.println("n_pro = " + p.n_pro);
        System.out.println("n_pub = " + p.n_pub);
    }
}
