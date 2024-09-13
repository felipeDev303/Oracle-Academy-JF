package bucles;

import javax.swing.JOptionPane;

public class Comprueba_Email {
    public static void main(String[] args){

        int arroba=0;
        boolean punto=false;

        String email=JOptionPane.showInputDialog("Introduce Email: ");

        for(int i=0; i<email.length(); i++) {

            if (email.charAt(i) == '@') {
                arroba++;
            }

            if (email.charAt(i) == '.') {
                punto = true;
            }

        }

        if(arroba==1 && punto==true){
            System.out.println("Formato correcto");
        }

        else{
            System.out.println("Formato incorrecto");
        }

    }
}
