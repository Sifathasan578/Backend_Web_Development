package com.imrul.hasan.sifat;

public class Main {
    public static void main(String[] args) {
        Animal a1 = AnimalFactory.getAnimal("dog");
        Animal a2 = AnimalFactory.getAnimal("cat");

        a1.makeSound();
        a2.makeSound();
    }
}

package com.imrul.hasan.sifat;

abstract class Animal {
    abstract void makeSound(); // body thakte parbe nah!
}

package com.imrul.hasan.sifat;

public class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof!");
    }
}

package com.imrul.hasan.sifat;

public class Cat extends Animal {
    void makeSound() {
        System.out.println("Meow!");
    }
}

package com.imrul.hasan.sifat;

public class AnimalFactory {
    static Animal getAnimal(String type) {
        if(type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else {
            return null; // object er default value null
        }
    }
}























