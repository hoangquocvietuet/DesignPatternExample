public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(10, 10, 5, new RedColor()),
            new Rectangle(10, 10, 5, 5, new BlueColor()),
        };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
