import java.util.ArrayList;
import java.util.List;

public class Box implements Component {
    private List<Component> components;

    public Box() {
        this.components = new ArrayList<Component>();
    }

    public void addProduct(Component component) {
        if (component == this) {
            throw new IllegalArgumentException("Cannot add box to itself");
        }
        if (component instanceof Box && ((Box)component).contains(this)) {
            throw new IllegalArgumentException("A box cannot be added to a box it contains.");        
        }
        this.components.add(component);
    }

    public boolean contains(Component component) {
        return this.components.contains(component);
    }

    public int getPrice() {
        int price = 0;
        for (Component component : this.components) {
            price += component.getPrice();
        }
        return price;
    }
}
