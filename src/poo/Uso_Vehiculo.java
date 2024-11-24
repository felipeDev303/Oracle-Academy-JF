package poo;

// import javax.swing.*;

public class Uso_Vehiculo {
    public static void main(String[]args){

        Automovil miauto1=new Automovil();
        miauto1.set_color("Rojo");

        Furgoneta mifurgoneta1=new Furgoneta(7,580);
        mifurgoneta1.set_color("Azul");
        mifurgoneta1.set_asientos("Si");
        mifurgoneta1.set_climatizador("Si");

        System.out.println(miauto1.get_datos_generales()+" "+miauto1.get_color());
        System.out.println(mifurgoneta1.get_datos_generales()+". "+mifurgoneta1.get_color()+". "+mifurgoneta1.getDatosFurgoneta());

        /*Automovil miauto= new Automovil();

        miauto.establece_color(JOptionPane.showInputDialog("Introduce color"));

        System.out.println(miauto.get_datos_generales());

        System.out.println(miauto.get_color());

        miauto.set_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));

        System.out.println(miauto.get_asientos());

        miauto.set_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));

        System.out.println(miauto.get_climatizador());

        System.out.println(miauto.get_peso_auto());

        System.out.println("El precio final del Automóvil es: "+miauto.precio_auto);*/



    }
}
