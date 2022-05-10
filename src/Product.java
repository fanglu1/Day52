public class Product {
    private double cost;
    private int amount;
    private String productName;

    public Product (double cost, int amount, String productName) {
        this.cost = cost;
        this.amount = amount;
        this.productName = productName;
    }
    public double totalCost() {
        return amount * cost;
    }
    public String printProduct() {
        return "One unit of " + productName + " cost $" + cost + " and " + amount + " units were purchased." + "\n Total cost of the " + amount + " " + productName + " cost " + totalCost();
    }
}
