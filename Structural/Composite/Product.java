public class Product implements Component {
    private int price;

    public Product(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}
