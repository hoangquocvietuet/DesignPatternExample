public class Car {
    private String partA;
    private String partB;
    private String partC;

    public Car() {
        partA = "not build yet";
        partB = "not build yet";
        partC = "not build yet";
    }

    public void setPartA(String partA) {
        this.partA = partA;
    }

    public void setPartB(String partB) {
        this.partB = partB;
    }

    public void setPartC(String partC) {
        this.partC = partC;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    public String getPartC() {
        return partC;
    }
}
