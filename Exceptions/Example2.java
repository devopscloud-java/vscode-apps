package Exceptions;

public class Example2 {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length();
            System.out.println("Length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        }
    }
}
