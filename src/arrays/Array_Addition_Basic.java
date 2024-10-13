package arrays;

import java.util.Scanner;

public class Array_Addition_Basic {
    public static void main(String[] args) {
        // Crear objeto scanner para recibir la entrada del usuario
        Scanner in = new Scanner(System.in);

        // Declarar e inicializa el array de 2 números
        int[] nums = new int[2];

        // Ingresar al array los números del usuario
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese número para la posición " + (i + 1) + ": ");
            nums[i] = in.nextInt();
        }

        // Cerrar el scanner
        in.close();

        // Suma de los números de array
        System.out.println("La suma de los valores del array son: ");
        System.out.println(nums[0] + nums[1]);
    }
}
