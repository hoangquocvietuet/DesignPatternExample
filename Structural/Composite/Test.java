public class Test {
    public static void main(String[] args) {
        Box box = new Box();
        box.addProduct(new Product(10));
        box.addProduct(new Product(20));
        box.addProduct(new Product(30));
        Box box2 = new Box();
        box2.addProduct(new Product(40));
        box2.addProduct(new Product(50));
        box.addProduct(box2);
        System.out.println(box2.getPrice());
        System.out.println(box.getPrice());
    }
}
