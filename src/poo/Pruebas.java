package poo;

public class Pruebas {
    public static void main(String[]args){

    }
}

// Clase Empleado
class Empleados{

    // Constructor
    public Empleados(String nom){
        nombre=nom;
        seccion="Administración";
    }

    // Setter para cambiar sección
    public void setSeccion(String seccion){
        // utilizamos this para diferenciar campo de clase del argumento cuando coinciden
        this.seccion=seccion;
    }

    // Getter para devolver la información del empleado
    public String getDatos(){
        return "El nombre es: " + nombre + "La sección es: " + seccion;
    }

    // Variables encapsuladas
    private String nombre;
    private String seccion;
}