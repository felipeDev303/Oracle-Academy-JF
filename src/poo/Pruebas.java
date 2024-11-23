package poo;

public class Pruebas {
    public static void main(String[]args){

        Empleados trabajador1=new Empleados("Felipe");
        Empleados trabajador2=new Empleados("Ana");
        Empleados trabajador3=new Empleados("María");
        Empleados trabajador4=new Empleados("Paulina");

        trabajador1.setSeccion("IT");

        System.out.println(trabajador1.getDatos());
        System.out.println(trabajador2.getDatos());
        System.out.println(trabajador3.getDatos());
        System.out.println(trabajador4.getDatos());


    }
}

// Clase Empleado
class Empleados{

    // Constructor
    public Empleados(String nom){
        nombre=nom;
        seccion="Administración";
        Id=IdSiguiente;
        IdSiguiente++;
    }

    // Setter para cambiar sección
    public void setSeccion(String seccion){
        // utilizamos this para diferenciar campo de clase del argumento cuando coinciden
        this.seccion=seccion;
    }

    /* Setter para modificar nombre empleado
    public void setNombre(String nombre){
        this.nombre=nombre;
    } //Cannot assign a value to final variable 'nombre'*/

    // Getter para devolver la información del empleado
    public String getDatos(){
        return "El nombre es: " + nombre + " La sección es: " + seccion + " Su ID: "+ Id;
    }

    // Variables encapsuladas (objeto)
    private final String nombre; // Constante
    private String seccion;
    private int Id;

    // Variable de clase (al ser private no se puede utilizar fuera de la clase)
    private static int IdSiguiente=1; // No es final ya que necesitamos que cambie correlativamente (final solo paa constantes)
    //public static int Id;

}