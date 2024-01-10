public class CarManualBuilder implements Builder {
    private Car car;

    public CarManualBuilder() {
        car = new Car();
    }

    public void buildPartA() {
        car.setPartA("Car Manual Part A");
    }

    public void buildPartB() {
        car.setPartB("Car Manual Part B");
    }

    public void buildPartC() {
        car.setPartC("Car Manual Part C");
    }

    public Car getResult() {
        return car;
    }
}
