package cuentas;

import java.util.ArrayList;

public class CuentaCorriente {
    private String rut;
    private String password;
    private int saldo;
    private String numeroCuenta;
    private ArrayList<Movimiento> movimientos;

    // Constructor para clientes con RUT y contraseña
    public CuentaCorriente(String rut, String password) {
        this.rut = rut;
        this.password = password;
        this.saldo = 0;
        this.numeroCuenta = generarNumeroCuenta(); // Genera un número de cuenta único
        this.movimientos = new ArrayList<>();
    }

    // Constructor para funcionarios con RUT y contraseña (sin saldo inicial)
    public CuentaCorriente(String rut, String password, boolean esFuncionario) {
        this(rut, password); // Llama al constructor principal
        if (esFuncionario) {
            this.saldo = 0; // Asegura que los funcionarios no tienen saldo inicial
        }
    }

    // Método para generar un número de cuenta único
    private String generarNumeroCuenta() {
        // Lógica para generar un número de cuenta único
        return "NUMERO-" + System.currentTimeMillis(); // Ejemplo simple
    }

    // Métodos de acceso (getters y setters)
    public String getRut() {
        return rut;
    }

    public String getPassword() {
        return password;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    // Métodos para abonar y cargar dinero
    public void abonar(int cantidad) {
        saldo += cantidad;
        movimientos.add(new Movimiento("Abono", cantidad));
    }

    public void cargar(int cantidad) {
        saldo -= cantidad;
        movimientos.add(new Movimiento("Carga", cantidad));
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "rut='" + rut + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                '}';
    }
}



