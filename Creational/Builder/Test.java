public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Sports Car");
        System.out.println("Part A: " + car.getPartA());
        System.out.println("Part B: " + car.getPartB());
        System.out.println("Part C: " + car.getPartC());

        builder = new CarManualBuilder();
        director.constructSUV(builder);
        car = builder.getResult();
        System.out.println("SUV");
        System.out.println("Part A: " + car.getPartA());
        System.out.println("Part B: " + car.getPartB());
        System.out.println("Part C: " + car.getPartC());
    }
}
