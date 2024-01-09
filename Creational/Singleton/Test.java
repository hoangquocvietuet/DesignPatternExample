public class Test {
    public static void main(String[] args) {
        Calculator c1 = Calculator.getInstance();
        Calculator c2 = Calculator.getInstance();
        System.out.println(c1 == c2);
    }
}
