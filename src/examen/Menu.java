package examen;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Menu {
    private List<Colaborador> colaboradores = new ArrayList<>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    public Menu() {
        sdf.setLenient(false);  // Desactiva la corrección automática de fechas
    }

    // Método para ejecutar el menú principal
    public void ejecutarMenu(Scanner scanner) {
        int opcion = 0;
        do {
            mostrarMenu();
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                manejarOpcion(opcion, scanner);
            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar un número válido.");
            }
        } while (opcion != 5);
    }

    // Mostrar las opciones del menú
    private void mostrarMenu() {
        System.out.println("----- Menú Principal -----");
        System.out.println("1. Ingresar Colaborador");
        System.out.println("2. Ver Colaborador");
        System.out.println("3. Eliminar Colaborador");
        System.out.println("4. Estado de la Empresa");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    // Manejar la opción seleccionada por el usuario
    private void manejarOpcion(int opcion, Scanner scanner) {
        switch (opcion) {
            case 1:
                ingresarColaborador(scanner);
                break;
            case 2:
                verColaborador(scanner);
                break;
            case 3:
                eliminarColaborador(scanner);
                break;
            case 4:
                mostrarEstadoEmpresa();
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intente nuevamente.");
        }
    }

    // Opción 1: Ingresar Colaborador
    private void ingresarColaborador(Scanner scanner) {
        try {
            System.out.print("Ingrese RUT (sin puntos ni guión, 9 dígitos): ");
            String rut = scanner.nextLine();

            System.out.print("Ingrese Nombre (Nombre Apellido_M Apellido_P): ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese Género (Masculino/Femenino/Otro): ");
            String genero = scanner.nextLine();

            // Validación de la fecha de nacimiento
            Date fechaNacimiento = null;
            do {
                System.out.print("Ingrese Fecha de Nacimiento (DD-MM-YYYY): ");
                String fechaNacInput = scanner.nextLine();
                fechaNacimiento = validarFecha(fechaNacInput);
                if (fechaNacimiento == null) {
                    System.out.println("Fecha inválida. Intente nuevamente.");
                }
            } while (fechaNacimiento == null);

            // Validación de la fecha de ingreso
            Date fechaIngreso = null;
            do {
                System.out.print("Ingrese Fecha de Ingreso (DD-MM-YYYY): ");
                String fechaIngresoInput = scanner.nextLine();
                fechaIngreso = validarFecha(fechaIngresoInput);
                if (fechaIngreso == null) {
                    System.out.println("Fecha inválida. Intente nuevamente.");
                }
            } while (fechaIngreso == null);

            System.out.print("Ingrese Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Ingrese Departamento: ");
            String departamento = scanner.nextLine();

            System.out.print("Ingrese Sueldo Base: ");
            int sueldoBase = Integer.parseInt(scanner.nextLine());

            Colaborador nuevoColaborador = new Colaborador(rut, nombre, genero, fechaNacimiento, fechaIngreso, cargo, departamento, sueldoBase);
            colaboradores.add(nuevoColaborador);
            System.out.println("Colaborador ingresado con éxito.");

        } catch (NumberFormatException e) {
            System.out.println("Error: El sueldo base debe ser un número entero.");
        } catch (Exception e) {
            System.out.println("Error en la entrada de datos: " + e.getMessage());
        }
    }

    // Método para validar fechas
    private Date validarFecha(String fecha) {
        try {
            return sdf.parse(fecha);  // Intenta parsear la fecha
        } catch (ParseException e) {
            return null;  // Retorna null si la fecha es inválida
        }
    }

    // Opción 2: Ver Colaborador
    private void verColaborador(Scanner scanner) {
        System.out.print("Ingrese el RUT del colaborador (sin formato): ");
        String rutInput = scanner.nextLine();
        String rutFormateado = formatearRUT(rutInput); // Formatear el RUT ingresado

        for (Colaborador c : colaboradores) {
            if (c.getRUT().equals(rutFormateado)) {
                mostrarDetalleColaborador(c);
                return;
            }
        }
        System.out.println("Colaborador no encontrado.");
    }

    // Método para formatear el RUT ingresado
    private String formatearRUT(String rutSinFormato) {
        if (rutSinFormato.length() != 9) {
            throw new IllegalArgumentException("El RUT debe tener 9 dígitos.");
        }
        return rutSinFormato.substring(0, 2) + "." + rutSinFormato.substring(2, 5) + "." + rutSinFormato.substring(5, 8) + "-" + rutSinFormato.charAt(8);
    }

    // Mostrar los detalles del colaborador
    private void mostrarDetalleColaborador(Colaborador c) {
        System.out.println("RUT: " + c.getRUT());
        System.out.println("Nombre: " + c.getNombre());
        System.out.println("Edad: " + c.getEdad() + " años");
        System.out.println("Cargo: " + c.getDiasEnCargo() + " días en el cargo - " + c.getCargo());
        System.out.println("Departamento: " + c.getDepartamento());
        System.out.println("Sueldo Líquido: " + c.getSueldoLiquido());
    }

    // Opción 3: Eliminar Colaborador (Desactivar)
    private void eliminarColaborador(Scanner scanner) {
        System.out.print("Ingrese el RUT del colaborador a desactivar (sin formato): ");
        String rutInput = scanner.nextLine();
        String rutFormateado = formatearRUT(rutInput); // Formatear el RUT ingresado

        for (Colaborador c : colaboradores) {
            if (c.getRUT().equals(rutFormateado)) {
                c.desactivar();
                System.out.println("Colaborador desactivado.");
                return;
            }
        }
        System.out.println("Colaborador no encontrado.");
    }

    // Opción 4: Estado de la Empresa
    private void mostrarEstadoEmpresa() {
        System.out.println("[Colaboradores Activos]");
        for (Colaborador c : colaboradores) {
            if (c.isActivo()) {
                System.out.println(c);
            }
        }

        System.out.println("\n[Colaboradores Inactivos]");
        for (Colaborador c : colaboradores) {
            if (!c.isActivo()) {
                System.out.println(c);
            }
        }
    }
}
