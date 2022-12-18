package Tests;

public class Catch {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: How can be divided?");
            System.out.println("Error: Division by zero is not allowed");
        }
    }
}
