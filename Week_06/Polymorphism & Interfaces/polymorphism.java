package com.polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

//        car.go();
//        bike.go();
//        boat.go();

//        Car[] cars = {car, bike, boat}; // can not work for bike, boat

        Vehicle[] vehicles = {car, bike, boat}; // all are vehicles so okay. upcasting

        for (Vehicle vehicle: vehicles) {
            vehicle.go();
        }

        // Polymorphism can be achieved too via interfaces!

        /*public interface Vehicle {
            void go() {
                System.out.println("You drive the car");
            }
        }*/
    }
}

package com.polymorphism;

public abstract class Vehicle {
    abstract void go();
}

package com.polymorphism;

public class Car extends Vehicle{
    @Override
    public void go() {
        System.out.println("You drive the car");
    }
}

package com.polymorphism;

public class Bike extends Vehicle{
    @Override
    public void go() {
        System.out.println("You ride the bike");
    }
}

package com.polymorphism;

public class Boat extends Vehicle {
    @Override
    public void go() {
        System.out.println("You sail the boat");
    }
}








