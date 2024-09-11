package bucles;

import java.util.*;

public class Adivina_Numero { // Inicio de la clase
    public static void main(String[] args){ // Inicio del main

        int aleatorio = (int)(Math.random()*100); // Genera un número aleatorio entre 0 y 100

        Scanner entrada = new Scanner(System.in); // Creación de un objeto Scanner

        int numero = 0; // Inicialización de la variable numero

        int intentos = 0; // Inicialización de la variable intentos

        while(numero!=aleatorio){
            intentos++; // Incrementa el número de intentos
            System.out.println("Introduce un número por favor: ");
            numero=entrada.nextInt() ; // Guarda el número introducido por el usuario

            if(aleatorio<numero){ // Si el número aleatorio es menor que el número introducido
                System.out.println("Más bajo");
            }else if(aleatorio>numero){ // Si el número aleatorio es mayor que el número introducido
                System.out.println("Más alto");
            }
        }
        System.out.println("Correcto lo has conseguido en "+intentos+" intentos"); // Muestra el número de intentos
    }
}
