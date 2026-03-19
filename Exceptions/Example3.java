package Exceptions;

public class Example3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        try {
            int value = arr[5];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an index that is out of bounds.");
        }
    }   
}
