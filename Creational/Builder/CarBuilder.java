public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public void buildPartA() {
        car.setPartA("Car Part A");
    }

    public void buildPartB() {
        car.setPartB("Car Part B");
    }

    public void buildPartC() {
        car.setPartC("Car Part C");
    }

    public Car getResult() {
        return car;
    }
}
