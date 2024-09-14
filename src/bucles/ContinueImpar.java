package bucles;

import java.util.Scanner;

public class ContinueImpar {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int numInputs = 10, input = 0;

        for(int i = 0; i < numInputs; i++){
            input = in.nextInt(); //El usuario ingresa un número
            if(input % 2 == 0) //Si es par continua
                continue; //Vuelve a evaluar la condición
            System.out.println("El número es impar"); //Salida solo cuando es impar
        }//fin for
    }//fin método principal
}//end class ContinueExample
