package poo;

import java.util.*;

// Clase Main
public class Uso_Empleado {
    public static void main(String[]args){

    }
}

// Clase que construye el objeto
class Empleado{

    // Constructor (public para que sea accesible de otras clases)
    public Empleado(String nom, double sue, int agno, int mes, int dia){

        // Variables
        nombre=nom;
        sueldo=sue;
        // Nombre de la clase / Nombre del objeto / new (llamar al constructor de la clase) / elegimos constructor(fecha)
        GregorianCalendar calendario= new GregorianCalendar(agno,mes-1,dia);

        // En la variable altaContrato almacenamos lo que nos retorne el método del objeto calendario
        altaContrato=calendario.getTime();
    }

    //Getter
    public String getNombre(){
        return nombre;
    }

    public double getSueldo(){
        return sueldo;
    }

    public Date getFechaContrato(){
        return altaContrato;
    }

    // Setter
    public void subeSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo +=aumento;
    }

    // Variables de clase (propiedades del objeto)
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}