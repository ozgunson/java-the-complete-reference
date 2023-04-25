package org.example.javathecompletereference.packagesandinterfaces.mypack;

public class Balance {

    String name;
    double bal;

    Balance(String name, double bal) {
        this.name = name;
        this.bal = bal;
    }

    void show() {
        if(bal < 0)
            System.out.println("--->");
        System.out.println(name + ": $" + bal);
    }

    /* First, by
    default, the Java run-time system uses the current working directory as its starting point.
    Thus, if your package is in a subdirectory of the current directory, it will be found. Second,
    you can specify a directory path or paths by setting the CLASSPATH environmental variable.
    Third, you can use the -classpath option with java and javac to specify the path to your
    classes. It is useful to point out that, beginning with JDK 9, a package can be part of a module,
    and thus found on the module path.
     */

}
