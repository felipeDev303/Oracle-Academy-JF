package arrays;

public class Practico3 {
    public static void main(String[] args){
        // Declaración e inicialización de matriz num (2 filas y 3 columnas:
        int[][] num = {{3,3,3},{2,2,2}};
        // Declaración e inicialización del array array:
        int[] array = {4,3,2};
        //Primer bucle for: Este bucle recorre 3 veces (i:0 a 2)
        for(int i = 0; i < 3; i++){
            // En cada iteración modifica la segunda fila de la matriz num
            num[1][i] = num[0][i]+array[i]; // Suma el valor de la primera fila con el valor del arreglo array
        } // i0 3+4=7 | i1 3+3=6 | i2 3+2=5
        // Al finalizar este bucle, la matriz num queda num[0] = {3, 3, 3} y num[1] = {7, 6, 5}

        // Segundo bucle for, doble bucle que recorre la matriz num y la imprime fila por fila.
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(num[i][j]);
            }
            System.out.println(); // la matriz num queda num[0] = {3, 3, 3} y num[1] = {7, 6, 5}
        }
    }
}
