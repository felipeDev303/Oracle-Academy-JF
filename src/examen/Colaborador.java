package examen;

import java.util.Calendar;
import java.util.Date;

public class Colaborador {
    private String rut;
    private String nombre;
    private String genero;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private String cargo;
    private String departamento;
    private int sueldoBase;
    private boolean activo;

    // Constructor
    public Colaborador(String rut, String nombre, String genero, Date fechaNacimiento, Date fechaIngreso, String cargo, String departamento, int sueldoBase) {
        this.rut = formatearRUT(rut);
        this.nombre = nombre;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.departamento = departamento;
        this.sueldoBase = sueldoBase;
        this.activo = true;  // El colaborador es activo por defecto
    }

    private String formatearRUT(String rutSinFormato) {
        if (rutSinFormato.length() != 9) {
            throw new IllegalArgumentException("El RUT debe tener 9 dígitos.");
        }
        return rutSinFormato.substring(0, 2) + "." + rutSinFormato.substring(2, 5) + "." + rutSinFormato.substring(5, 8) + "-" + rutSinFormato.charAt(8);
    }

    // Métodos get
    public String getRUT() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void desactivar() {
        this.activo = false;
    }

    public int getEdad() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        cal.setTime(fechaNacimiento);
        return year - cal.get(Calendar.YEAR);
    }

    public int getDiasEnCargo() {
        long diff = new Date().getTime() - fechaIngreso.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }

    public int getSueldoLiquido() {
        int gratificacion = 75000;
        int colacion = 20000;
        int locomocion = 35000;
        int descuentoSalud = (int) (sueldoBase * 0.07);
        int descuentoAFP = (int) (sueldoBase * 0.10);
        return sueldoBase + gratificacion + colacion + locomocion - descuentoSalud - descuentoAFP;
    }

    @Override
    public String toString() {
        return nombre + ", " + getEdad() + ", " + cargo;
    }
}




