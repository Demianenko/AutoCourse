package Third;

/**
 * Created by user on 31.05.2016.
 */
public class Calculator {
    private double first;
    private double second;
    private String operation;

    public Calculator() {
    }

    public Calculator(double first, double second, String operation) {
        this.first = first;
        this.second = second;

        this.operation = operation;
    }

    public double getFirst() {
        return first;
    }

    public double getSecond() {
        return second;
    }

    public String getOperation() {
        return operation;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
    public double calc(double first, double second, String operation) {
        switch (operation){
            case "+":
                return first+second;
            case "-":
                return first-second;
            case "*":
                return first*second;
            case "/":
                return first/second;
            default:
                System.out.println("Operation error");
                return 0.0;
        }
    }
}
