package calculator;

import calculator.Operation;

public class Multiplication implements Operation {
    public Multiplication() { }

    @Override
    public void calculate(int a, int b) {
        System.out.println("Результат умножения: " + (a*b));
    }
}
