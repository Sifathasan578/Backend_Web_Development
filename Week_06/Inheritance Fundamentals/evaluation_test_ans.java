package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Sifat", 26);
        Student student = new Student("Imrul", 26, 3.91);

        // Upcasting
        display(new Employee("Arafat", 26, 50000));
        display(new Teacher("Shakil", 27, 40000, "Physics"));
        display(new Student("Zarir", 25, 3.55));
        display(new Admin("Nahid", 24, 35000, "Forensics"));

        // Downcasting
        Person p = new Person("Foysal", 22);
        Teacher t = (Teacher) p;
        t.teach();

        System.out.println("Name is accessed by getter not directly from child, name is: " + student.getName() + "");
    }

    public static void display(Person person) {
        person.displayInfo();
    }
}

package com.imrul.hasan.sifat;

public class Admin extends Employee {
    private final String department;

    public Admin(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void manage() {
        System.out.println("Managing " + department + " department!");
    }
}

package com.imrul.hasan.sifat;

public class Student extends Person{
    private final double cgpa;

    public Student(String name, int age, double cgpa) {
        super(name, age);
        this.cgpa = cgpa;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("CGPA: " + cgpa);
    }

    public void study() {
        System.out.println("Student " + getName() + " is studying!");
    }
}

package com.imrul.hasan.sifat;

public class Teacher extends Employee{
    private final String subject;

    public Teacher(String name, int age, double salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }

    public void teach() {
        System.out.println("Teaching " + subject);
    }
}

package com.imrul.hasan.sifat;

public class Employee extends Person {
    protected final double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary; // extra feature
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }

    public void work() {
        System.out.println("Employee is working!");
    }

    public double getSalary() {
        return salary;
    }
}

package com.imrul.hasan.sifat;

public class Person { // eikhane final dite keno parlam nah?
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
