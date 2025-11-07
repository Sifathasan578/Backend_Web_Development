// Abstraction: 

package com.abstraction;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape(); // Can not do that because of abstract

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6,7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());

        circle.display();
        triangle.display();
        rectangle.display();
    }
}

package com.abstraction;

public abstract class Shape { // kono shape objects create kora jabenah!
    abstract double area(); // abstract classes can have abstract methods and concrete methods

    void display() { // concrete method
        System.out.println("This is a shape");
    }
}

package com.abstraction;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

package com.abstraction;

public class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

package com.abstraction;

public class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
