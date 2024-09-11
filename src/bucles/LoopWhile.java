package bucles;

import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int numInputs = 0; // Contador
        int sum = 0; // Acumulador
        int input; // Variable para almacenar el número introducido por el usuario

        while(numInputs < 10){ // Condición de parada
            System.out.print("Introduce un número: "); // Solicitar al usuario que introduzca un número
            input = in.nextInt(); // Leer un número entero
            sum+=input; // Acumular la suma de los números introducidos
                numInputs++; // Incrementar el contador de números introducidos
        } // end while

        System.out.println("La suma de los 10 números introducidos es: " + sum); // Mostrar la suma de los números introducidos
    } // final del método main
} // final de la clase LoopPractice
