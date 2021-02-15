package calculator;

import java.util.Scanner;

public class Application {

    public Application() {}

    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Добро пожаловать в калькулятор !");
        System.out.println("--------------------------------");
        this.run();
        System.out.println("--------------------------------");
        System.out.println("Пока");
    }

    private void run() {
        while(true) {
            int[] numbers = this.gettingUserNumbers();
            Operation result = this.select();
            if (result == null) {
                break;
            }
            result.calculate(numbers[0], numbers[1]);
            System.out.println("--------------------------------");
        }
    }

    private int[] gettingUserNumbers() {

        int a = 0;
        int b = 0;
        int state = 1;

        while (state != 0) {
            System.out.println("Введите число " + (state == 1 ? "A" : "B") + ":");

            int number = scanner.nextInt();
            if (state == 1) {
                a = number;
                state = 2;
            } else {
                b = number;
                break;
            }
        }

        return new int[] {a, b};
    }

    private Operation select() {
        this.showMenu();
        int number = scanner.nextInt();

        switch (number) {
            case 1: return new Summation();
            case 2: return new Subtraction();
            case 3: return new Multiplication();
            case 4: return new Division();
            case 0: return null;
        }

        System.out.println("Нет такой фигуры. Повторите ввод");
        return select();
    }

    private void showMenu() {
        System.out.println("------ Выберите операцию ------");
        System.out.println("1 - сложение");
        System.out.println("2 - вычитание");
        System.out.println("3 - умножение");
        System.out.println("4 - деление");
        System.out.println("0 - выход");
    }
}
