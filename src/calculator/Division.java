package calculator;

public class Division implements Operation {
    public Division() {}


    @Override
    public void calculate(int a, int b) {
        System.out.println("Результат деления: " + (a/b));
    }
}
