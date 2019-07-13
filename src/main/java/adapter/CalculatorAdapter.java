package adapter;

import port.CalculatorPort;

public class CalculatorAdapter implements CalculatorPort {
    public Double add(Double a, Double b) {
        return a+b;
    }

    public Double subtract(Double a, Double b) {
        return a-b;
    }

    public Double multiply(Double a, Double b) {
        return a*b;
    }

    public Double divide(Double a, Double b){
        if(b!=0) return a/b;
        else throw new ArithmeticException("/ by zero");
    }
}
