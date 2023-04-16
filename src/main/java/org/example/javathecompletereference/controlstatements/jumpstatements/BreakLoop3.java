package org.example.javathecompletereference.controlstatements.jumpstatements;

public class BreakLoop3 {
    public static void main(String[] args) {
        for(int i=0; i<3; i++) {
            System.out.print("Pass " + i + ": ");
            for(int j=0; j<100; j++) {
                if(j == 10) break; // terminate loop if j is 10
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}
// break was not designed to provide the normal means by which a loop is terminated. The loop’s
//conditional expression serves this purpose. The break statement should be used to cancel a loop only when
//some sort of special situation occurs

//    Here are two other points to remember about break. First, more than one break statement
//        may appear in a loop. However, be careful. Too many break statements have the tendency to
//        destructure your code. Second, the break that terminates a switch statement affects only that
//        switch statement and not any enclosing loops