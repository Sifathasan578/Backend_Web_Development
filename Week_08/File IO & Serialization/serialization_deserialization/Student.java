package file_io_serialization.serialization_deserialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L; /**/

    private String name;
    private int age;
    private String grade;

    public String bloodGroup;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade='" + grade + "'}";
    }
}
