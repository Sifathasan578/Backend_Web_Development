package file_io_serialization;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        /*// Reading file with FileReader, Inefficient
        try (FileReader reader = new FileReader("D:/Backend - Java/Projects/module-8-exception-handling-file-i_o/src/main/java/file_io_serialization/input.txt")) { // try with resource, autoclosable, It automatically closes the FileReader after the try block finishes — even if an exception occurs.
            int ch;
            while((ch = reader.read()) != -1)  {
                System.out.print((char) ch);
            }
            System.out.println();
        }
        catch (IOException e) { // checked exception
            System.out.println("Error while reading file. Message: " + e.getMessage()); // ?
            e.printStackTrace(); // prints the full details of the error to the console.
        }*/

        /*// Writing with FileWriter, Inefficient
        String filePath = "D:/Backend - Java/Projects/module-8-exception-handling-file-i_o/src/main/java/file_io_serialization/output.txt";

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write("Hello, World!\n");
            writer.write("This is written using FileWriter.\n");
            writer.write("FileWriter handles characters and stores them in text files.");
        }
        catch (IOException e) {
            System.out.println("Error while writing file. Message: " + e.getMessage()); // e.getMessage:
            e.printStackTrace();
        }*/

        /*// Reading with InputStream and creating copy using OutputStream
        // It copies a file (here, an image input.jpg) from one location (sourcePath) to another (destinationPath) using byte streams (FileInputStream and FileOutputStream).
        String sourcePath = "D:/Backend - Java/Projects/module-8-exception-handling-file-i_o/src/main/java/file_io_serialization/input.jpg";
        String destinationPath = "D:/Backend - Java/Projects/module-8-exception-handling-file-i_o/src/main/java/file_io_serialization/output.jpg";

        try(FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[1024]; // read 1KB chunks, 1kb = 1024 bytes
            int bytesRead;

            while((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead); // write what exactly was read
            }

            System.out.println("Image copied successfully!");
        }
        catch (IOException e) {
            e.printStackTrace();
        }*/


    }
}
