package level1_basics.exercise03_product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Smartphone", 1200.00, 55);

        product1.displayInformation();
        product1.removeStock(40);
        product1.displayInformation();
    }
}
