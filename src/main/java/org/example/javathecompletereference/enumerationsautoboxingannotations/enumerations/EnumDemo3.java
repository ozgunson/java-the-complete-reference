package org.example.javathecompletereference.enumerationsautoboxingannotations.enumerations;

public class EnumDemo3 {
    public static void main(String[] args) {
        NewApple ap;

        // Display price of Winesap.
        System.out.println("Winesap costs: " + NewApple.Winesap.getPrice() + " cents.");
        // Display all apples and prices.
        System.out.println("All apple prices:");
        for(NewApple newApple : NewApple.values()) {
            System.out.println(newApple + " costs " + newApple.getPrice() + " cents.");
        }
    }
}
