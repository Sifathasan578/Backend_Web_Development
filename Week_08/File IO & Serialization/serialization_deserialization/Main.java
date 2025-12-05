package file_io_serialization.serialization_deserialization;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        /*// Deserialization, definition
            // jei byte gula save korcilam oigulare abar byte object banaite chai
        // Serialization, definition
            // object er state or instance variable gula ache eitate dhore ek jagay save kore rakha, byte hoye thakbe

        // transcient use korle ignore korbe*/

        Student student = new Student("John Doe", 20, "A");
        String fileName = "src/main/resources/student.ser";

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(student);
            System.out.println("Student object serialized and saved to " + fileName);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // ----- Deserialization -----
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Student deserializedStudent = (Student) ois.readObject();
            System.out.println("Student object deserialized from file:");
            System.out.println(deserializedStudent);
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
