package com.runtime_polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(); // Not possible

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.print("Would you like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else {
            animal = new Cat();
            animal.speak();
        }
    }
}
package com.runtime_polymorphism;

public abstract class Animal {
    abstract void speak();
}
package com.runtime_polymorphism;

public class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("Woof!");
    }
}
package com.runtime_polymorphism;

public class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow!");
    }
}
