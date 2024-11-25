package poo;

import java.util.*;

// Clase Main
public class Uso_Empleado {
    public static void main(String[]args){

        // Versión con arrays

        Jefatura jefe_RRHH = new Jefatura("Don Carter",1000000,2023,1,2);

        jefe_RRHH.setIncentivo(25000);

        Empleado[] misEmpleados=new Empleado[5];
        misEmpleados[0]=new Empleado("Felipe Morales",500000,2020,12,11);
        misEmpleados[1]=new Empleado("Papu Gomez",400000,2021,11,10);
        misEmpleados[2]=new Empleado("Lionel Messi",600000,2017,9,8);
        misEmpleados[3]=jefe_RRHH; // Polimorfismo en acción (Podemos utilizar un objeto de la subclase cuando
        // espero un objeto de la superclase)
        misEmpleados[4]=new Jefatura("Tío Rene",1000000,2023,3,1);

        Jefatura jefe_MKT = (Jefatura) misEmpleados[4];

        jefe_MKT.setIncentivo(35000);

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
class Empleado {

    // Constructor (public para que sea accesible de otras clases)
    public Empleado(String nom, double sue, int agno, int mes, int dia) {

        // Variables
        nombre = nom;
        sueldo = sue;
        // Nombre de la clase / Nombre del objeto / new (llamar al constructor de la clase) / elegimos constructor(fecha)
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);

        // En la variable altaContrato almacenamos lo que nos retorne el método del objeto calendario
        altaContrato = calendario.getTime();
    }

    // Sobrecarga de constructores
    public Empleado(String nom) {
        this(nom, 30000, 2000, 1, 1);
    }

    //Getter
    public String getNombre() {
        return nombre;
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
    private String nombre;
    private double sueldo;
    private Date altaContrato;
}

class Jefatura extends Empleado {

    // Constructor de la clase hija
    public Jefatura(String nom, double sue, int agno, int mes, int dia) {

        // Constructor de la clase padre
        super(nom, sue, agno, mes, dia);

    }

    // Método setter
    public void setIncentivo(double b) {
        incentivo = b;
    }

    // Método getter
    public double getSueldo() {
        double sueldoJefe = super.getSueldo();
        return sueldoJefe + incentivo;
    }

    // variable de clase
    private double incentivo;
}

    class Director extends Jefatura{
        public Director(String nom, double sue, int agno, int mes, int dia) {

            // Constructor de la clase padre
            super(nom, sue, agno, mes, dia);
        }
    }