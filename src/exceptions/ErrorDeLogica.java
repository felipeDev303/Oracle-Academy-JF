package exceptions;

public class ErrorDeLogica {
    public static void main(String[] args) {

        String str = "Hello World";
        for (int i = 0; i < 4; i++);//<-- Este punto y coma sobra
        {
            System.out.println(str);
            str += "!";

        }

    }
} // Imprime solo un Hola Mundo, no vuelve a entrar al ciclo
