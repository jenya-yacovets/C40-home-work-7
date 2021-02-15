package calculator;

public class Summation implements Operation{
    public Summation() {}

    @Override
    public void calculate(int a, int b) {
        System.out.println("Результат сложения: " + (a+b));
    }
}
