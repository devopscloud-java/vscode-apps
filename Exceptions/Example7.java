package Exceptions;

public class Example7 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is zero
    }   
}
