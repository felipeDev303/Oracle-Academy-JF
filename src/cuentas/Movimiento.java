package cuentas;

import java.time.LocalDateTime; // Importamos la clase LocalDateTime para manejar la fecha y hora

public class Movimiento {
    private String tipo; // Tipo de movimiento (Abono o Cargo)
    private int monto;   // Monto del movimiento
    private LocalDateTime fecha; // Fecha y hora del movimiento

    // Constructor para crear un movimiento
    public Movimiento(String tipo, int monto) {
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = LocalDateTime.now(); // Establece la fecha y hora actual
    }

    // Getter para el tipo de movimiento
    public String getTipo() {
        return tipo;
    }

    // Setter para el tipo de movimiento
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter para el monto del movimiento
    public int getMonto() {
        return monto;
    }

    // Setter para el monto del movimiento
    public void setMonto(int monto) {
        this.monto = monto;
    }

    // Getter para la fecha del movimiento
    public LocalDateTime getFecha() {
        return fecha;
    }

    // Setter para la fecha del movimiento
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    // Método toString para representar el movimiento como una cadena
    @Override
    public String toString() {
        return "Movimiento{" +
                "tipo='" + tipo + '\'' +
                ", monto=" + monto +
                ", fecha=" + fecha +
                '}';
    }
}


