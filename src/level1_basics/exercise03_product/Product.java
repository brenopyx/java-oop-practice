package level1_basics.exercise03_product;

public class Product {
    private String name;
    private double price;
    private int inventory;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.setPrice(price);
        this.setInventory(quantity);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Insert valid price");
        }
    }

    public int getInventory() {
        return inventory;
    }

    private void setInventory(int quantity) {
        if (quantity >= 0) {
            this.inventory = quantity;
        } else {
            System.out.println("The quantity enter is invalid");
        }
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            setInventory(getInventory() + quantity);
        } else {
            System.out.println("The quantity enter is invalid");
        }
    }

    public void removeStock(int quantity) {
        if (quantity <= getInventory() && quantity > 0) {
            setInventory(getInventory() - quantity);
        } else {
            System.out.println("The inventory haven't this quantity of  available product");
        }
    }

    private double calculateTotalStockValue() {
        double total = getInventory() * getPrice();
        return total;
    }

    public void displayInformation() {
        String value = String.format("%,.2f", calculateTotalStockValue());

        System.out.println("---Product Information---");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Available Quantity: " + getInventory());
        System.out.println("Total Value Inventory: " + value);
    }
}
