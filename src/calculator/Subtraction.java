package calculator;

public class Subtraction implements Operation {
    public Subtraction() {}

    @Override
    public void calculate(int a, int b) {
        System.out.println("Результат вычитания: " + (a-b));
    }
}
