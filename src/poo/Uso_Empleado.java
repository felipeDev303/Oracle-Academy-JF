package poo;

import java.util.*;

// Clase Main
public class Uso_Empleado {
    public static void main(String[]args){

        /*// Creamos 3 instancias (objetos) de la clase Empleado
        Empleado empleado1=new Empleado("Felipe Morales",500000,2020,12,11);
        Empleado empleado2=new Empleado("Papu Gomez",400000,2021,11,10);
        Empleado empleado3=new Empleado("Lionel Messi",600000,2017,9,8);

        // Utilizamos el método sube sueldo
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);

        System.out.println("Nombre: " + empleado1.getNombre() + " ,su nuevo sueldo es "+ empleado1.getSueldo()
        + " Fecha de contrato: " + empleado1.getFechaContrato());

        System.out.println("Nombre: " + empleado2.getNombre() + " ,su nuevo sueldo es "+ empleado2.getSueldo()
                + " Fecha de contrato: " + empleado2.getFechaContrato());

        System.out.println("Nombre: " + empleado3.getNombre() + " ,su nuevo sueldo es "+ empleado3.getSueldo()
                + " Fecha de contrato: " + empleado3.getFechaContrato());*/

        // Versión con arrays
        Empleado[] misEmpleados=new Empleado[3];
        misEmpleados[0]=new Empleado("Felipe Morales",500000,2020,12,11);
        misEmpleados[1]=new Empleado("Papu Gomez",400000,2021,11,10);
        misEmpleados[2]=new Empleado("Lionel Messi",600000,2017,9,8);

        /*for(int i=0;i<misEmpleados.length;i++){
            misEmpleados[i].subeSueldo(5);
        }

        for(int i=0;i<misEmpleados.length;i++){
            System.out.println("Nombre: " + misEmpleados[i].getNombre() + " Sueldo: "+ misEmpleados[i].getSueldo() + " Fecha Contrato: "+misEmpleados[i].getFechaContrato());
        }*/

        // Versión for mejorado
        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.getNombre() + " Sueldo: "+ e.getSueldo() + " Fecha Contrato: "+ e.getFechaContrato());
        }
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