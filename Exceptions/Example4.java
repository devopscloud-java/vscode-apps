package Exceptions;

public class Example4 {
    public static void main(String[] args) {
        String str = "Hello";
        try {
            char ch = str.charAt(10);
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds in the string.");
        }
    }
}
