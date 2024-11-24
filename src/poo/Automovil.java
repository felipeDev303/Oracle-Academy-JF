package poo;

// Clase Auto
public class Automovil {
    // Atributos
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;

    // Constructor
    public Automovil(){
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }

    // Getter datos generales
    public String get_datos_generales(){
        return "La plataforma del vehículo "+ruedas+" ruedas "+
                " mide " + largo/1000+" metros con un ancho de "
                +ancho+" cm y un peso de plataforma"+peso_plataforma+" kg";
    }

    // Setter color
    public void establece_color(String color_auto){
        color=color_auto;
    }

    // Getter color
    public String get_color(){
        return "El color del Automóvil es: "+color;
    }

    // Setter asientos (SE PUEDE SIMPLIFICAR)
    public void set_asientos(String asientos_cuero){
        if(asientos_cuero.equalsIgnoreCase("si")) {
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero=false;
        }
    }

    // Getter asientos
    public String get_asientos(){
        if(asientos_cuero){
            return"El Automóvil tiene asientos de cuero";
        }else{
            return "El Automóvil no tiene asientos de cuero";
        }
    }

    // Setter Climatizador (SE PUEDE SIMPLIFICAR)
    public void set_climatizador(String climatizador){
        if(climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        }else{
            this.climatizador=false;
        }
    }

    // Getter asientos
    public String get_climatizador(){
        if(climatizador){
            return"El Automóvil tiene climatizador";
        }else{
            return "El Automóvil no tiene climatizador";
        }
    }


    // Getter + Setter peso (NO RECOMENDABLE)
    public String get_peso_auto(){
        int peso_carroceria=500;
        peso_total=peso_carroceria+peso_plataforma;
        if(asientos_cuero){
            peso_total=peso_total+50;
        }
        if(climatizador){
            peso_total=peso_total+20;
        }
        return"El peso del Automóvil es "+peso_total;
    }

    public int precio_auto(){
        int precio_final=10000;
        if(asientos_cuero){
            precio_final+=2000;
        }
        if(climatizador){
            precio_final+=1500;
        }
        return precio_final;
    }


}
