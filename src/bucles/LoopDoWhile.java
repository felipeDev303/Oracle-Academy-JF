package bucles;

import java.util.Scanner;

public class LoopDoWhile { // Clase LoopDoWhile
    public static void main(String[] args){ // Método main
        Scanner in = new Scanner(System.in); // Crear un objeto Scanner
        int numInputs = 0; // Contador
        int sum = 0, input = 0; // Acumulador y variable para almacenar el número introducido por el usuario
        do{ // Hacer
            System.out.println("Enter a number"); // Solicitar al usuario que introduzca un número
            input = in.nextInt(); // Leer un número entero
            sum+=input; // Acumular la suma de los números introducidos
            numInputs++; // Incrementar el contador de números introducidos
        }while(numInputs < 10); // Mientras el contador sea menor que 10
        System.out.println("The sum of the 10 numbers entered is: " + sum); // Mostrar la suma de los números introducidos
    } // end main
} // end LoopDoWhile
