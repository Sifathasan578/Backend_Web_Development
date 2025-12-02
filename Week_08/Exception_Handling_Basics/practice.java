package exception_handling_basics;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int n = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        try {
            String n = null;
            System.out.println(n.length());
        }
        catch (NullPointerException e) { // specific must come first
            System.out.println("Null found");
        }
        catch (Exception e) { // polymorphism, upcasting, upper class
            System.out.println("General error occurred");
        }

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Access");
        }
        finally {
            System.out.println("This will always run");
        }

        // Caller handling it
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found!");
        }

        /*// Try catch example
        try {
            int[] numbers = {10, 1,  2, 3, 4, 5, 6};
            System.out.println(numbers[10]); // potential exception
        }
//        catch (Exception e) {
        catch (IndexOutOfBoundsException e) { // more specific or child class
            System.out.println("Something went wrong!");
        }*/
    }
    // throw
    public static void checkAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Age must be 18+");
        }
        System.out.println("Valid Age");
    }

    // throws
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }

    public static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Division error: " + e.getMessage());
            return -1;  // fallback value
        } finally {
            System.out.println("Done processing divide.");
        }
    }

    // real life example
    public static void readMyFile() {
        FileReader fr = null;
        try {
            fr = new FileReader("data.txt");
            System.out.println("File opened!");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally {
            if (fr != null) {
                try { fr.close(); }
                catch (IOException ignored) {}
            }
            System.out.println("File closed.");
        }
    }

    /*// Multiple Catch Block, this code??
    public static int getPlayerScore(String playerFile)  {
        try (Scanner contents = new Scanner(new File(playerFile))) {  // ??
            return Integer.parseInt(contents.nextLine());
        }
        catch (FileNotFoundException e) {
            logger.warn("Player file not found!", e);
            return 0;
        }
        catch (IOException e) {
            logger.warn("Player file wouldn't load!", e); // logger?
            return 0;
        }
        catch (NumberFormatException e) {
            logger.warn("Player file was corrupted!", e);
            return 0;
        }
    }

    // Finally, Code explain?
    public int static getPlayerScore(String playerFile) throws FileNotFoundException {
        Scanner contents = null;
        try {
            contents = new Scanner(new File(playerFile));
            return Integer.parseInt(contents.nextLine());
        } finally {
            if (contents != null) {
                contents.close();
            }
        }
    }

    // IndexOutOfBoundsException is an unchecked exception
    public static void writeList() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        for(int i = 0; i < SIZE; i++) {
            out.println("Value at: " + i + " = " + list.get(i));
        }
        out.close();
    }

    // Union catch block
    public int getPlayerScore(String playerFile) {
        try (Scanner contents = new Scanner(new File(playerFile))) {
            return Integer.parseInt(contents.nextLine());
        } catch (IOException | NumberFormatException e) { // two exceptions
            logger.warn("Failed to load score!", e);
            return 0;
        }
    }

    // Creating Custom Exception
    public class MyCustomException extends Exception {
        public MyCustomException(String message) {
            super(message);
        }
        public MyCustomException(String message, Throwable cause) {
            super(message, cause);
        }
    }*/
}
