package org.example.javathecompletereference.inheritance.morepracticalexample;

public class DemoBoxWeight {

    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
    }

    /* BoxWeight inherits all of the characteristics of Box and adds to them the weight
    component. It is not necessary for BoxWeight to re-create all of the features found in
    Box. It can simply extend Box to meet its own purposes.
     */
}
