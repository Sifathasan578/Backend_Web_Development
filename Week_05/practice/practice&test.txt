Test: 
🧠 Section A — Conceptual (Short Questions)
What is the difference between a class and an object in Java?
ans: class is a blueprint and object is a instance of that class. we can make multiple instances or objects using that class. 
What happens if you don’t define a constructor in a class?
ans: default constructor is used which we can’t see. 
Can a constructor have a return type? Why or why not?
ans: no. because constructor does not return anything. it’s usage is to initialize variable or do other things during object creation.


What is constructor overloading and why is it useful?
ans: if we define multiple constructors with different signature parameters then it is called constructor overloading. it can be used if we need constructor with different type of paraments. 
Explain the difference between the this() and super() keywords. When can you use each?
ans: this() refers to the constructor of the same class and super() refers constructor for the parent class. this() and super() can be used when we need call different constructors. 
💻 Section B — Coding Questions
Default Constructor Practice
 Create a Book class that has two fields: title and author.


Don’t define any constructor.


Create an object in main() and assign values manually.


Print the book details.
package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        /*Parent parent = new Parent("Sifat", 25);
        parent.displayInfo();*/

//        Child child = new Child("Shakil", 27);

        Book book = new Book();
        book.author = "Imrul Hasan Sifat";
        book.title = "My Demons Inside Me";

        System.out.println(book.author);
        System.out.println(book.title);
    }
}

package com.imrul.hasan.sifat;

public class Book {
    String title;
    String author;
}

################## #####################

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(); 
        student.display();
    }
}

package com.imrul.hasan.sifat;

public class Student {
    String name;
    String id;
    String cgpa;

    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", CGPA: " + cgpa);
    }
}

Constructor Overloading
 Write a class Circle with:
One constructor that takes no parameters and sets radius = 1.0.


Another constructor that takes one parameter to set the radius.


A method getArea() that returns the area.
 Then, create two circles in main() and print their areas.
package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println(circle.getArea());
        System.out.println(circle2.getArea());
    }
}

package com.imrul.hasan.sifat;

public class Circle {
    double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.1415 * radius * radius;
    }
}
#############
Create a class Employee with fields name and salary.


Write a constructor that has parameters with the same name as the fields.


Use this to assign parameter values to the fields.


Print the employee details.

package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Sifat", 1000000);
        employee.display();
    }
}
package com.imrul.hasan.sifat;

public class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee: " + name + ", Salary: " + salary);
    }
}

##########
package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Peru");
    }
}
package com.imrul.hasan.sifat;

public class Animal {
    public Animal(String type) {
        System.out.println("Type: " + type);
        System.out.println("Parent Constructor Called First");
    }
}
package com.imrul.hasan.sifat;

class Dog extends Animal {
    Dog(String name) {
        super("Dog");
        System.out.println("Name: " + name);
        System.out.println("Then Child Constructor is Called!");
    }
}
