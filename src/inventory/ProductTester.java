package inventory;

import java.util.Scanner;

public class ProductTester {
    public ProductTester() {
    }

       public static void main(String[] args) {
           // Crear Scanner para la entrada del usuario
           Scanner in = new Scanner(System.in);

           // Variables locales para almacenar los datos temporales para los atributos de los productos
           int tempNumber;
           String tempName;
           int tempQty;
           int tempPrice;

           // Solicitar al usuario que introduzca valores para los atributos de Product para crear Producto 1(p1)
           System.out.println("Ingrese el número de producto (id): ");
           tempNumber = in.nextInt();
           in.nextLine();  // Consumir la nueva línea pendiente

           System.out.println("Ingrese el nombre del producto: ");
           tempName = in.nextLine();

           System.out.println("Ingrese la cantidad en stock: ");
           tempQty = in.nextInt();

           System.out.println("Ingrese el precio del producto: ");
           tempPrice = in.nextInt();

           // Crear el objeto p1 usando el constructor que toma 4 parámetros
           Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);


           // Llamar al setter para modificar el estado de activo
           // p1.setActive(false); // esto cambiaría el estado de activo a falso

           // Verificar el valor actualizado usando el getter
           // System.out.println("Estado del producto: " + (p1.isActive() ? "Activo":"Descatalogado"));


           // Imprimir el objeto p1
           System.out.println(p1);

           // Llamar al setter del método del cálculo del inventario
           // p1.getInventoryValue();

           // Cerrar el Scanner
           in.close();

        /*Product product1 = new Product(1, "Cerveza Tamango", 10, 3600);
        Product product2 = new Product(2, "Cerveza Jester", 20, 4500);
        Product product3 = new Product(3, "Cerveza LOA", 30, 4500);
        Product product4 = new Product(4, "Cerveza Delirium", 40, 4200);
        Product product5 = new Product();
        Product product6 = new Product();
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);
        System.out.println(product6);*/
    }
}