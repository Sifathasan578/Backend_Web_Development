// --------------------------
// INTERFACES
// --------------------------
interface Flyable {
    // abstract method
    void fly();

    // default method (has body)
    default void land() {
        System.out.println("Landing safely...");
    }

    // static method (belongs to interface)
    static void showInfo() {
        System.out.println("Flyable: represents ability to fly.");
    }
}

interface Swimmable {
    void swim();
}

// --------------------------
// ABSTRACT CLASS
// --------------------------
abstract class Animal {
    String name;
    int age;

    // abstract method (must be implemented by subclasses)
    abstract void makeSound();

    // concrete method (shared behavior)
    void sleep() {
        System.out.println(name + " is sleeping...");
    }

    // constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// --------------------------
// CONCRETE CLASSES
// --------------------------
class Dog extends Animal implements Swimmable {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}

class Bird extends Animal implements Flyable {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Chirp!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying high.");
    }
}

class Duck extends Animal implements Flyable, Swimmable {
    Duck(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Quack!");
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying low over the pond.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming gracefully.");
    }
}

// --------------------------
// MAIN CLASS (DEMO)
// --------------------------
public class Main {
    public static void main(String[] args) {
        // Abstract class reference - polymorphism
        Animal dog = new Dog("Buddy", 3);
        Animal bird = new Bird("Sparrow", 1);
        Animal duck = new Duck("Donald", 2);

        // Demonstrate abstraction
        dog.makeSound();
        bird.makeSound();
        duck.makeSound();

        dog.sleep();
        bird.sleep();
        duck.sleep();

        // Demonstrate interface usage
        ((Flyable) bird).fly();    // cast to Flyable
        ((Flyable) duck).fly();
        ((Flyable) duck).land();   // default method in interface

        ((Swimmable) dog).swim();
        ((Swimmable) duck).swim();

        // Static method in interface
        Flyable.showInfo();

        // Example of polymorphism via interface reference
        Flyable f = new Duck("Daisy", 1);
        f.fly();
        f.land();
    }
}
