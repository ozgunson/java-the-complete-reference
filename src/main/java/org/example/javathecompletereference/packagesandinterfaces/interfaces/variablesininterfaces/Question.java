package org.example.javathecompletereference.packagesandinterfaces.interfaces.variablesininterfaces;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();
    int ask() {
        int prob = (int) (100 * rand.nextDouble());
        if (prob < 30)
            return NO; // 30%
        else if (prob < 60)
            return YES; // 30%
        else if (prob < 75)
            return LATER; // 15%
        else if (prob < 98)
            return SOON; // 13%
        else
            return NEVER; // 2%
    }

    /*
    Notice that this program makes use of one of Java’s standard classes: Random. This class
    provides pseudorandom numbers. It contains several methods that allow you to obtain
    random numbers in the form required by your program. In this example, the method
    nextDouble( ) is used. It returns random numbers in the range 0.0 to 1.0.

     */
}
