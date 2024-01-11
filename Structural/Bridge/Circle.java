public class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing a " + radius + " " + color + " circle at (" + x + "," + y + ")");
    }
}
