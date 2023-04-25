package org.example.javathecompletereference.packagesandinterfaces.importingpackages;

import org.example.javathecompletereference.packagesandinterfaces.importingpackages.mypack.*;

public class TestBalance {
    public static void main(String[] args) {
 /* Because Balance is public, you may use Balance
 class and call its constructor. */
        Balance test = new Balance("J. J. Jaspers", 99.88);
        test.show(); // you may also call show()
    }

    /*
    As an experiment, remove the public specifier from the Balance class and then try
compiling TestBalance. As explained, errors will result.
     */

    /*
    Java includes the import
statement to bring certain classes, or entire packages, into visibility. Once imported, a class
can be referred to directly, using only its name. The import statement is a convenience to the
programmer and is not technically needed to write a complete Java program. If you are going
to refer to a few dozen classes in your application, however, the import statement will save a
lot of typing.
     */
}
