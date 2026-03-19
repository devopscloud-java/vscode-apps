package Exceptions;

public class Example5 {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Attempted to parse a non-numeric string as an integer.");
        }
    }
}
