package generics;

// Non-generic class!
/*public class Box {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }
}*/

// Generic Class:
//public class Box<T extends Number> // Only for numbers, Bounded type
public class Box<T> { // kon type er data use korbe sheita bole dibe! T eikhane ekta type define korce, jekono type ashte hobe
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    // Generic method
    <T> void myMethod(T argument) {
        // Method body!
    }


}