package bucles;

import java.util.Scanner;

public class LoopDoWhile2 { // Clase LoopDoWhile2
    public static void main(String[] args){ // Método main
        Scanner in = new Scanner(System.in); // Crear un objeto Scanner
        int repeat = 0; // Variable para almacenar si el usuario desea introducir otro número
        int sum = 0, input = 0; // Acumulador y variable para almacenar el número introducido por el usuario
        do{ // Hacer
            System.out.println("Enter a number"); // Solicitar al usuario que introduzca un número
            input = in.nextInt(); // Leer un número entero
            sum+=input; // Acumular la suma de los números introducidos
            System.out.println("Do you want to enter another number? (1: Yes, 2: No)"); // Preguntar al usuario si desea introducir otro número
            repeat = in.nextInt(); // Leer la respuesta del usuario
        }while(repeat==1); // Mientras el usuario desee introducir otro número
        System.out.println("The sum of the numbers entered is: " + sum); // Mostrar la suma de los números introducidos
    }
}
