package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        /*Parent parent = new Parent("Sifat", 25);
        parent.displayInfo();*/

        Child child = new Child("Shakil", 27);
        
    }
}

package com.imrul.hasan.sifat;

public class Parent {
    private String name;
    private int age;

    /*public Parent() { // default

    }*/

    public Parent() {
        this("Sifat", 26);
        System.out.println("Parent is called");
    }

    public Parent(String name, int age) { // overloaded constructor
        this.name = name;
        this.age = age;
        System.out.println("Parent is called");
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

package com.imrul.hasan.sifat;

public class Child extends Parent {
    public Child(String name, int age) {
        super(name, age);
        System.out.println("Child is called");
    }
}

package com.imrul.hasan.sifat;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
}
