public class Rectangle extends Shape {
    private int width, height;

    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width; this.height = height;
    }

    public void draw() {
        System.out.println("Drawing a " + width + "x" + height + " " + color + " rectangle at (" + x + "," + y + ")");
    }
}
