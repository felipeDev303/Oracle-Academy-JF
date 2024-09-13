package bucles;

import java.util.Scanner;

public class BreakExample{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int numInputs = 10, input = 0, sum = 0, stopLoop = 999;

        for(int i = 0; i < numInputs; i++){
            input = in.nextInt(); //Usuario ingresa un número
            if(input == stopLoop) //si el número 999, salir
                break; //no se suma 1 al contador del loop
            else
                sum += input; //Si no es 999, se suma 1 al contador
        }//end for

        System.out.println("La suma de los números es: " + sum);
    }//end method main
}//end class BreakExample