package arrays;

import javax.swing.*;

public class Array_For_Each2 {
    public static void main (String[] args){
        // Declaramos el array en una sola línea
        String[] paises=new String[8];
        for(int i=0;i<paises.length;i++){

            paises[i]=JOptionPane.showInputDialog("Introduce tu país: "+(i+1));

        }
        for(String elemento:paises){
            System.out.println("País: " + elemento);
        }
    }
}
