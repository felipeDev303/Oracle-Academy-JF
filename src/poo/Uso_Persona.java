package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main (String[]args){

        Persona [] lasPersonas = new Persona[2];
        lasPersonas[0]=new Empleado2 ("Antoine Dupont",50000,2009,2,25);
        lasPersonas[1]=new Alumno("Felipe Morales","Programador");

        for(Persona p:lasPersonas){
            System.out.println(p.getNombre()+", "+p.getDescription());
        }
    }
}

abstract class Persona{

    // Constructor que recibe por parámetro una cadena para su estado inicial
    public Persona(String nom){
        // variable nombre es igual al parámetro
        nombre=nom;
    }

    public String getNombre(){
        return nombre;
    }

    public abstract String getDescription();

    // Variable de clase
    private String nombre;
}

// Clase que construye el objeto
class Empleado2 extends Persona {

    // Constructor (public para que sea accesible de otras clases)
    public Empleado2(String nom, double sue, int agno, int mes, int dia) {

        super(nom);
        // Variables
        sueldo = sue;
        // Nombre de la clase / Nombre del objeto / new (llamar al constructor de la clase) / elegimos constructor(fecha)
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

        // En la variable altaContrato almacenamos lo que nos retorne el método del objeto calendario
        altaContrato = calendario.getTime();

        ++IdSiguiente;
        Id=IdSiguiente;
    }

    public String getDescription(){
        return "Este empleado tiene un Id: "+ Id+" con un sueldo: "+sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Date getFechaContrato() {
        return altaContrato;
    }

    // Setter
    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }

    // Variables de clase (propiedades del objeto)
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente;
    private int Id;
}

class Alumno extends Persona{
    public Alumno(String nom, String car){
        super(nom);
        carrera=car;
    }

    public String getDescription(){
        return "El alumno está estudiando la carrera de: "+carrera;
    }

    private String carrera;
}