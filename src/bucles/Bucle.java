package bucles;

import javax.swing.*;

public class Bucle {
    public static void main(String[] args) {
        // Bucles Indeterminados (While, Do-While)

        // While: Se ejecuta mientras la condición sea verdadera
        String clave="felipe"; // Contraseña correcta

        String pass=""; // Contraseña introducida por el usuario

        while (clave.equals(pass)==false){ // Método equals compara dos cadenas de texto
            pass=JOptionPane.showInputDialog("Introduce la contraseña, por favor");

            if (clave.equals(pass)==false){
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }
        }

        JOptionPane.showMessageDialog(null, "Contraseña correcta, bienvenido");

        // Bucles determinados (For)
    }
}