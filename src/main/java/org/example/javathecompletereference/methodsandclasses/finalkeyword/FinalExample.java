package org.example.javathecompletereference.methodsandclasses.finalkeyword;

public class FinalExample {
    final static int FILE_NEW = 1;
    final int FILE_OPEN = 2;
    final int FILE_SAVE = 3;
    final int FILE_SAVEAS = 4;
    final int FILE_QUIT = 5;

    public static void main(String[] args) {
        System.out.println(FILE_NEW);
        // FILE_NEW = 3; // wrong, we can't change the value of variable declared as final.
        System.out.println(FILE_NEW);
    }
}
