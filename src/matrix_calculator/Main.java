package matrix_calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        // Declaración de las matrices bidimensionales (ingresadas por el usuario)
        int [][] A = new int [2][2];
        int [][] B = new int [2][2];
        int [][] C = new int [2][2];

        Scanner scanner = new Scanner(System.in);
        boolean Salir=false;
        int opcion;

        do {
            System.out.println("Esta es una calculara de matrices");
            System.out.println("Ingrese los números de la Matriz A");
            // Ciclo para llenar matriz A
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("Ingrese el dígito para la posición [" + i + "][" + j + "]");
                    A[i][j] = scanner.nextInt();
                }

            }

            System.out.println("Ingrese los números de la Matriz B");
            // Ciclo para llenar matriz B
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.println("Ingrese el dígito para la posición [" + i + "][" + j + "]");
                    B[i][j] = scanner.nextInt();
                }

            }

            do{
                System.out.println("¿Qué operación desea realizar?");
                System.out.println("Opción 1.- Suma de matrices");
                System.out.println("Opción 2.- Resta de matrices");
                System.out.println("Opción 3.- Multiplicación de matrices");
                System.out.println("Opción 4.- Salir");

                opcion = scanner.nextInt();

            } while(opcion < 1 || opcion > 4);

            switch(opcion){
                case 1:
                    System.out.println(C[0][0]=A[0][0]+B[0][0]);
                    System.out.println(C[0][1]=A[0][1]+B[0][1]);
                    System.out.println(C[1][0]=A[1][0]+B[1][0]);
                    System.out.println(C[1][1]=A[1][1]+B[1][1]);
                    break;
                case 2:
                    System.out.println(C[0][0]=A[0][0]-B[0][0]);
                    System.out.println(C[0][1]=A[0][1]-B[0][1]);
                    System.out.println(C[1][0]=A[1][0]-B[1][0]);
                    System.out.println(C[1][1]=A[1][1]-B[1][1]);
                    break;
                case 3:
                    System.out.println(C[0][0]=(A[0][0]*B[0][0])+(A[0][1]*B[1][0]));
                    System.out.println(C[0][1]=(A[0][0]*B[0][1])+(A[0][1]*B[1][1]));
                    System.out.println(C[1][0]=(A[1][0]*B[0][0])+(A[1][1]*B[1][0]));
                    System.out.println(C[1][1]=(A[1][0]*B[0][1])+(A[1][1]*B[1][1]));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Gracias");
            }

        }while (opcion != 4);
    }
}
