package bucles;

import javax.swing.*;

public class Factorial {
    public static void main(String[] args){

        long resultado=1L;

        /*El método estático showInputDialog (se antepone a la clase) devuelve un String, es necesario convertirlo a entero
         mediante el uso del método parseInt para poder almacenarlo en una variable de tipo entero
        */
        int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));


        for(int i=numero;i>0;i--){
            resultado=resultado*i;
        }

        System.out.println("El resultado de " + numero + " es " + resultado);
    }
}
