package bucles;

import java.util.Scanner;

public class PalindromoTester { // Clase PalindromoTester
    public static void main(String[] args){ // Método main
        Scanner in = new Scanner(System.in); // Crear un objeto Scanner
        System.out.println("Introduce una palabra:"); // Solicitar al usuario que introduzca una palabra
        String word = in.next(); // Leer la palabra introducida por el usuario
        int firstPosition = 0; // Posición inicial de la palabra
        int lastPosition = word.length() - 1; // Posición final de la palabra
        boolean isAPalindrome = true; // Variable para almacenar si la palabra es un palíndromo

        while (firstPosition < lastPosition) { // Mientras la posición inicial sea menor que la posición final
            if(word.charAt(firstPosition)!=word.charAt(lastPosition))
                isAPalindrome = false; // Si las letras en las posiciones no son iguales, no es un palíndromo
            firstPosition++; // Incrementar la posición inicial
            lastPosition--; // Decrementar la posición final
            } // end while

        if(isAPalindrome) System.out.println("La palabra es un palíndromo");
        else
            System.out.println("La palabra no es un palíndromo");
        } // end main
    } // end PalindromoTester
