package com.interfaces;

public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        // Implements two parents or classes
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }
}

package com.interfaces;

public interface Prey {
    void flee();
}

package com.interfaces;

public interface Predator {
    void hunt();
}

package com.interfaces;

public class Rabbit implements Prey {
    @Override
    public void flee() {
        System.out.println("The rabbit is running away!");
    }
}

package com.interfaces;

public class Fish implements Prey, Predator{
    @Override
    public void hunt() {
        System.out.println("The fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("The fish is swimming away");
    }
}

package com.interfaces;

public class Hawk implements Predator{
    @Override
    public void hunt() {
        System.out.println("The hawk is hunting!");
    }
}
