public class Buying {
    
    public static void main(String[] args) {
        String style = "victorian";
        FurnitureFactory factory = null;
        if (style.equals("modern")) {
            factory = new ModernFurnitureFactory();
        } else if (style.equals("victorian")) {
            factory = new VictorianFurnitureFactory();
        } else {
            throw new IllegalArgumentException("Unknown style: " + style);
        }
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        chair.sitOn();
        sofa.lieOn();
    }
}
