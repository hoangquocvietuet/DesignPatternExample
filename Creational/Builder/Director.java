public class Director {
    
    public void constructSportsCar(Builder builder) {
        builder.buildPartA();
        builder.buildPartC();
    }

    public void constructSUV(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
