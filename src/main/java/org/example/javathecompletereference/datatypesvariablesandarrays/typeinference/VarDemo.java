package org.example.javathecompletereference.datatypesvariablesandarrays.typeinference;

public class VarDemo {
    public static void main(String[] args) {
        // Use type inference to determine the type of the
        // variable named avg. In this case, double is inferred.
        var avg = 10.0;
        System.out.println("Value of avg: " + avg);
        // In the following context, var is not a predefined identifier.
        // It is simply a user-defined variable name.
        int var = 1;
        System.out.println("Value of var: " + var);
        // Interestingly, in the following sequence, var is used
        // as both the type of the declaration and as a variable name
        // in the initializer.
        var k = -var;
        System.out.println("Value of k: " + k);

        var merhaba = "Merhaba";
        System.out.println(merhaba);

        // The preceding example uses var to declare only simple variables, but you can also use
        //var to declare an array.
        var myArray = new int[10]; // This is valid.

        //Notice that neither var nor myArray has brackets. Instead, the type of myArray is inferred
        //to be int[ ]. Furthermore, you cannot use brackets on the left side of a var declaration.
        //var[] myArray = new int[10]; // Wrong


        //It is important to emphasize that var can be used to declare a variable only when that
        //variable is initialized.
        //var counter; // Wrong! Initializer required.


        //Although you can declare an array type using var, you cannot use var with an array initializer.
        //var myArray = { 1, 2, 3 }; // Wrong
    }
}
