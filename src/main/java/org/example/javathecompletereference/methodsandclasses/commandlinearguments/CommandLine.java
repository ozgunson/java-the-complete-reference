package org.example.javathecompletereference.methodsandclasses.commandlinearguments;

// Display all command-line arguments.
public class CommandLine {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
