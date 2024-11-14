package exceptions;

public class EjemploExcepcion {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;  // Esto generará una ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}
