package org.example.javathecompletereference.datatypesvariablesandarrays.arrays;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] threeD = new int[3][4][5];
        int i, j, k;
        for(i=0; i<3; i++)
            for(j=0; j<4; j++)
                for(k=0; k<5; k++)
                    threeD[i][j][k] = i * j * k;
        for(i=0; i<3; i++) {
            for(j=0; j<4; j++) {
                for(k=0; k<5; k++)
                    System.out.print(threeD[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }

        //Here, the square brackets follow the array variable name, and not the type specifier. For example,
        //the following two declarations are equivalent:
        int al[] = new int[3];
        int[] a2 = new int[3];
    }
}
