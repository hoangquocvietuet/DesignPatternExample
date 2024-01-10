import java.util.ArrayList;
import java.util.List;

public class Test {

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (int i = 0; i < shapes.size(); ++ i) {
            Shape clone = shapes.get(i).clone();
            shapesCopy.add(clone);

            if (shapes.get(i) != shapesCopy.get(i)) {
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println("AC");
                } else {
                    System.out.println("WA");
                }
            } else {
                System.out.println("WA");
            }
        }
    }

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();
        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }
}
