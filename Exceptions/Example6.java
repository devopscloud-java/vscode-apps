package Exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args) {            
        
       try {
            // Code that might throw a FileNotFoundException
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Error: File not found.");
        }

    }
}
