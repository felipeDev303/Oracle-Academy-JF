package arrays;

import java.util.Scanner; // Importamos la clase Scanner de Java Util
import java.util.ArrayList; // Importamos la clase Array de Java Util

public class Algebra {
    public static void main(String[] args){
        // Escriba un programa que tome dos arreglos y, luego, permita al usuario elegir sumar,
        // restar o multiplicar y mostrar la respuesta. El programa mostrará el siguiente menú:
        // a. Enter Arreglo A
        // b. Enter Arreglo B
        // c. Display A + B
        // d. Display A - B
        // e. Display A * B
        // f. Exit
        // El programa debe mostrar un ciclo y permitir al usuario continuar eligiendo diferentes
        // opciones hasta que eligen salir. El programa bien escrito colocará en módulos el
        // proceso en métodos diferentes.

        Scanner in = new Scanner(System.in); // Creamos un nuevo Scanner
        ArrayList<Integer> ArrayA=new ArrayList<>(); // Creamos el Array A
        for(int i=1;i<5;i++){ // Ciclo que itera en el objeto Scanner
            System.out.println("Ingrese números para un arreglo A: "); // Salida que pide los números
            ArrayA.add(in.nextInt()); // Guardamos los números del Array A
        }
        System.out.println("El array A es: "+ArrayA); // Salida con los números del array A

        ArrayList<Integer> ArrayB=new ArrayList<>(); // Creamos el Array B
        for(int i=1;i<5;i++){
            System.out.println("Ingrese números para un arreglo B: ");
            ArrayB.add(in.nextInt());
        }
        System.out.println("El array B es: "+ArrayB);

        Scanner menu = new Scanner(System.in);
        int opcion; // Almacenamos la opción del menú
        boolean salir=false;

        while(!salir){
            System.out.println("1. Display A + B");
            System.out.println("2. Display A - B");
            System.out.println("3. Display A * B");
            System.out.println("4. Salir");

            try {

                System.out.println("Ingrese la opción");
                opcion = menu.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Display A + B");
                        break;
                    case 2:
                        System.out.println("Display A - B");
                        break;
                    case 3:
                        System.out.println("Display A * B");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default: //default para evitar tener que comprobar que el número este en el rango de las opciones
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e){
                System.out.println("Debes insertar un número");
                menu.next();
            }
        }
    }
}
