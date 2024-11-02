package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args){

        Scanner scanner = new Scanner (System.in);

        int numero1, numero2,opcion;

        do {
            System.out.println("Ingrese número 1");
            numero1 = scanner.nextInt();
            System.out.println("Ingrese número 2");
            numero2 = scanner.nextInt();

            do {
                System.out.println("Opción 1.- Sumar.");
                System.out.println("Opción 2.- Restar.");
                System.out.println("Opción 3.- Multiplicar.");
                System.out.println("Opción 4.- Dividir.");
                System.out.println("Opción 5.- Salir.");
                System.out.println("\nIngrese una opción:");

                opcion = scanner.nextInt();

            } while (opcion < 1 || opcion > 5);

            switch (opcion) {
                case 1:
                    System.out.println(numero1 + numero2);
                    break;
                case 2:
                    System.out.println(numero1 - numero2);
                    break;
                case 3:
                    System.out.println(numero1 * numero2);
                    break;
                case 4:
                    System.out.println(numero1 / numero2);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gracias");
            }
        } while (opcion != 5);

    }
}
