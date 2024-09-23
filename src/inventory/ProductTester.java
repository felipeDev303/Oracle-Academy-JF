package inventory;

public class ProductTester {
    public ProductTester() {
    }

    public static void main(String[] args) {
        Product product = new Product(1, "Cerveza Tamango", 10, 3600);
        Product product2 = new Product(2, "Cerveza Jester", 20, 4500);
        Product product3 = new Product(3, "Cerveza LOA", 30, 4500);
        Product product4 = new Product(4, "Cerveza Delirium", 40, 4200);
        Product product5 = new Product();
        Product product6 = new Product();
        System.out.println(product);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println(product4);
        System.out.println(product5);
        System.out.println(product6);
    }
}
