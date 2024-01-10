public class Test {
    public static void main(String[] args) {
        Logistics logistics;
        String transportType = "sea";
        if (transportType.equals("road")) {
            logistics = new RoadLogistics();
        } else if (transportType.equals("sea")) {
            logistics = new SeaLogistics();
        } else {
            throw new RuntimeException("Unsupported transport type: " + transportType);
        }

        Transport transport = logistics.createTransport();
        transport.deliver();
    }
}
