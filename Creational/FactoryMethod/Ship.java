public class Ship extends Transport {
    Ship() {
        setWeight(50);
    }

    public void deliver() {
        System.out.println("Delivering by ship");
    }
}
