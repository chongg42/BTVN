public class Product {
    String productName;
    double price;
    int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public Product() {}
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1200.50, 10);
        double discount;
         discount = (product1.quantity > 10) ? 0.10 : 0.05;

        // Tính tổng tiền sau giảm giá
        double total = (product1.price * product1.quantity) * (1 - discount);

        // In kết quả
        System.out.println("Sản phẩm " + product1.productName + " - Tổng tiền: " + total);

    }
}
