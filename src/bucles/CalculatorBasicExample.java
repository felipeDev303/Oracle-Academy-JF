package bucles;

import java.util.Scanner;

public class CalculatorBasicExample{
    public static void main(String[] args){

        boolean quit = false;
        int num1 = 10, num2 = 6, answer = 0;
        char operand = '\0';

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Please enter a mathematical operand (*,+,-,/): ");
            String input = in.next();
            operand = input.charAt(0);
            switch(operand) {
                case '*': answer = num1 * num2;
                    break;
                case '+': answer = num1 + num2;
                    break;
                case '-': answer = num1 - num2;
                    break;
                case '/': answer = num1 / num2;
                    if(num2!=0){
                        answer = num1 / num2;
                    }else{
                        System.out.println("No se puede dividir por 0");
                    }
                    break;
                default:
                    System.out.println("Invalid input.");
                    continue; // Salta la impresión de la respuesta si el input es inválido
            }
            System.out.println("El resultado es: " + answer);

            System.out.println("Quit? Y/N");
            if(in.next().equalsIgnoreCase("Y")){
                quit=true;
            }
        } while(!quit);

        in.close();
    }//end method main

}//end class Section5Example