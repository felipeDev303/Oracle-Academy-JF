package arrays;

import java.util.Scanner;

public class Array_2D_Tester {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int[][]nums= new int[3][2];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.println("Ingrese un valor en la fila "+ i + ", columna " + j);
                nums[i][j] = in.nextInt();
            } // fin for
        }// fin for
    } // fin main
} // fin class Array_2D_Tester
