public class Calculator {
    private static Calculator instance = null;

    private Calculator() {

    }

    public static Calculator getInstance() {
        if (instance == null) {
            instance = new Calculator();
        }
        return instance;
    }

    public int add(int a, int b) {
        return a + b;
    }
}