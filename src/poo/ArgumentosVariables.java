package poo;

public class ArgumentosVariables {

    // Método con argumentos variables
    public static int sumarNumeros(int... numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static void main(String[] args) {
        // Llamadas al método con diferente número de argumentos
        System.out.println("Suma de 1, 2, 3: " + sumarNumeros(1, 2, 3)); // 6
        System.out.println("Suma de 4, 5: " + sumarNumeros(4, 5));       // 9
        System.out.println("Suma sin argumentos: " + sumarNumeros());    // 0
    }
}
