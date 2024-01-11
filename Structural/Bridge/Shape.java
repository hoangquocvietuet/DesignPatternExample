public abstract class Shape {
    public int x, y;
    public Color color;

    public Shape(int x, int y, Color color) {
        this.x = x; this.y = y; this.color = color;
    }

    public abstract void draw();
}
