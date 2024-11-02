package cuentas;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
    private ArrayList<CuentaCorriente> funcionarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // Método para iniciar el programa y gestionar el menú principal
    public void programa() {
        int opcion = -1;
        while (opcion != 0) {
            mostrarTipoUsuario(); // Pregunta si el usuario es cliente o funcionario
            opcion = elegirOpcion(); // Obtiene la opción seleccionada por el usuario
            ejecutarOpcion(opcion); // Ejecuta la opción seleccionada
        }
    }

    // Muestra las opciones para seleccionar si el usuario es cliente o funcionario
    private void mostrarTipoUsuario() {
        System.out.println("\nSeleccione el tipo de usuario:");
        System.out.println("1. Cliente");
        System.out.println("2. Funcionario");
        System.out.println("0. Salir");
    }

    // Lee la opción seleccionada por el usuario
    private int elegirOpcion() {
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    // Ejecuta la acción correspondiente según la opción seleccionada
    private void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                gestionarCliente(); // Gestiona las opciones para clientes
                break;
            case 2:
                gestionarFuncionario(); // Gestiona las opciones para funcionarios
                break;
            case 0:
                System.out.println("Hasta pronto.");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    // Gestiona las opciones para clientes
    private void gestionarCliente() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- Menú Cliente ---");
            System.out.println("1. Crear nueva cuenta");
            System.out.println("2. Ingresar a cuenta existente");
            System.out.println("0. Volver al menú principal");
            opcion = elegirOpcion();
            switch (opcion) {
                case 1:
                    crearCuenta(); // Crea una nueva cuenta para el cliente
                    break;
                case 2:
                    ingresarCuenta("cliente"); // Permite al cliente ingresar a su cuenta
                    break;
                case 0:
                    return; // Regresa al menú principal
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Gestiona las opciones para funcionarios
    private void gestionarFuncionario() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- Menú Funcionario ---");
            System.out.println("1. Crear cuenta funcionario");
            System.out.println("2. Ingresar a cuenta existente");
            System.out.println("0. Volver al menú principal");
            opcion = elegirOpcion();
            switch (opcion) {
                case 1:
                    crearCuentaFuncionario(); // Crea una nueva cuenta para el funcionario
                    break;
                case 2:
                    ingresarCuenta("funcionario"); // Permite al funcionario ingresar a su cuenta
                    break;
                case 0:
                    return; // Regresa al menú principal
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Crea una nueva cuenta de cliente
    private void crearCuenta() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("\n--- Crear Cuenta Cliente ---");
        System.out.print("Ingrese el RUT del titular (8 números): ");
        String rut = scanner.nextLine();
        System.out.print("Ingrese la contraseña (debe tener 4 dígitos): ");
        String password1 = scanner.nextLine();
        System.out.print("Repita la contraseña: ");
        String password2 = scanner.nextLine();
        if (password1.equals(password2) && password1.length() == 4 && rut.matches("\\d{8}")) {
            cuentas.add(new CuentaCorriente(rut, password1));
            System.out.println("Cuenta de cliente creada exitosamente.");
        } else {
            System.out.println("Error en la creación de la cuenta. Asegúrese de que la contraseña coincida y tenga 4 dígitos, y que el RUT tenga 8 números.");
        }
    }

    // Crea una nueva cuenta de funcionario
    private void crearCuentaFuncionario() {
        scanner.nextLine(); // Limpiar el buffer
        System.out.println("\n--- Crear Cuenta Funcionario ---");
        System.out.print("Ingrese el RUT del funcionario (8 números): ");
        String rut = scanner.nextLine();
        System.out.print("Ingrese la contraseña (debe tener 4 dígitos): ");
        String password1 = scanner.nextLine();
        System.out.print("Repita la contraseña: ");
        String password2 = scanner.nextLine();
        if (password1.equals(password2) && password1.length() == 4 && rut.matches("\\d{8}")) {
            funcionarios.add(new CuentaCorriente(rut, password1, true)); // La contraseña no afecta a las operaciones del funcionario
            System.out.println("Cuenta de funcionario creada exitosamente.");
        } else {
            System.out.println("Error en la creación de la cuenta. Asegúrese de que la contraseña coincida y tenga 4 dígitos, y que el RUT tenga 8 números.");
        }
    }

    // Permite a un cliente ingresar a su cuenta
    private void ingresarCuenta(String tipo) {
        System.out.println("\n--- Ingresar a Cuenta ---");
        System.out.print("Ingrese el RUT: ");
        String rut = scanner.next();
        System.out.print("Ingrese la contraseña: ");
        String password = scanner.next();
        CuentaCorriente cuenta = buscarCuenta(rut, password, tipo);
        if (cuenta != null) {
            if ("cliente".equals(tipo)) {
                gestionarOperacionesCliente(cuenta);
            } else if ("funcionario".equals(tipo)) {
                gestionarOperacionesFuncionario();
            }
        } else {
            System.out.println("RUT o contraseña incorrectos. Tres intentos fallidos devolverán al menú principal.");
            for (int i = 0; i < 2; i++) {
                System.out.print("Ingrese el RUT: ");
                rut = scanner.next();
                System.out.print("Ingrese la contraseña: ");
                password = scanner.next();
                cuenta = buscarCuenta(rut, password, tipo);
                if (cuenta != null) {
                    if ("cliente".equals(tipo)) {
                        gestionarOperacionesCliente(cuenta);
                    } else if ("funcionario".equals(tipo)) {
                        gestionarOperacionesFuncionario();
                    }
                    return;
                }
                System.out.println("RUT o contraseña incorrectos. Intente nuevamente.");
            }
            System.out.println("Número máximo de intentos fallidos alcanzado. Volviendo al menú principal.");
        }
    }

    // Busca una cuenta por RUT y contraseña
    private CuentaCorriente buscarCuenta(String rut, String password, String tipo) {
        ArrayList<CuentaCorriente> lista = "cliente".equals(tipo) ? cuentas : funcionarios;
        for (CuentaCorriente cuenta : lista) {
            if (cuenta.getRut().equals(rut) && cuenta.getPassword().equals(password)) {
                return cuenta;
            }
        }
        return null;
    }

    // Gestiona las operaciones que puede realizar un cliente después de ingresar
    private void gestionarOperacionesCliente(CuentaCorriente cuenta) {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- Menú Cliente ---");
            System.out.println("1. Abonar dinero");
            System.out.println("2. Cargar dinero");
            System.out.println("3. Ver saldo");
            System.out.println("0. Volver al menú principal");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    abonarDinero(cuenta);
                    break;
                case 2:
                    cargarDinero(cuenta);
                    break;
                case 3:
                    verSaldo(cuenta);
                    break;
                case 0:
                    return; // Regresa al menú principal
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Gestiona las operaciones que puede realizar un funcionario después de ingresar
    private void gestionarOperacionesFuncionario() {
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n--- Menú Funcionario ---");
            System.out.println("1. Ver cuentas creadas");
            System.out.println("2. Ver movimientos de cuentas");
            System.out.println("0. Volver al menú principal");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    verCuentas(); // Muestra todas las cuentas creadas
                    break;
                case 2:
                    verMovimientos(); // Muestra los movimientos de todas las cuentas
                    break;
                case 0:
                    return; // Regresa al menú principal
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    // Permite a un cliente abonar dinero a su cuenta
    private void abonarDinero(CuentaCorriente cuenta) {
        System.out.print("Ingrese la cantidad a abonar: ");
        int cantidad = scanner.nextInt();
        cuenta.abonar(cantidad);
        System.out.println("Cantidad abonada exitosamente.");
    }

    // Permite a un cliente cargar dinero a su cuenta
    private void cargarDinero(CuentaCorriente cuenta) {
        System.out.print("Ingrese la cantidad a cargar: ");
        int cantidad = scanner.nextInt();
        cuenta.cargar(cantidad);
        System.out.println("Cantidad cargada exitosamente.");
    }

    // Muestra el saldo de la cuenta del cliente
    private void verSaldo(CuentaCorriente cuenta) {
        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }

    // Muestra todas las cuentas creadas
    private void verCuentas() {
        System.out.println("\n--- Cuentas Creadas ---");
        for (CuentaCorriente cuenta : cuentas) {
            System.out.println(cuenta);
        }
        for (CuentaCorriente funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }

    // Muestra los movimientos de todas las cuentas
    private void verMovimientos() {
        System.out.println("\n--- Movimientos de Cuentas ---");
        // Asume que la clase CuentaCorriente tiene un método getMovimientos() que devuelve una lista de movimientos
        for (CuentaCorriente cuenta : cuentas) {
            System.out.println("Movimientos de la cuenta " + cuenta.getRut() + ":");
            for (Movimiento movimiento : cuenta.getMovimientos()) {
                System.out.println(movimiento);
            }
        }
    }
}
