public class Color {
    private int red, green, blue;

    public Color(int red, int green, int blue) {
        this.red = red; this.green = green; this.blue = blue;
    }

    public String toString() {
        return "rgb(" + red + "," + green + "," + blue + ")";
    }
}
