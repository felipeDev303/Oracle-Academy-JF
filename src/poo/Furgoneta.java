package poo;

// Subclase de Auto (Superclase o Clase padre)
public class Furgoneta extends Automovil {

    // Atributos con de subclase (clase hijo)
    private int plazas_extra;
    private int capacidad_carga;

    // Constructor Subclase
    public Furgoneta(int plazas_extra,int capacidad_carga){

        super(); // Llamar al Constructor Clase Padre (Superclase)
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
    }

    // Getter Clase hija
    public String getDatosFuergoneta(){
        return "La capacidad de carga es: "+capacidad_carga+" y las plazas son: "+plazas_extra;
    }

}
