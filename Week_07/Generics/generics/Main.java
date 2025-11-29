package generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        // Raw Types: Needs for backward compatibility!
        // ager code gula before java 5 use korar jonno!

        Box<Integer> newBox = new Box<>();
        Box box = newBox; // without angular brackets

        /*
        This uses raw type List.
        No generics → no type safety.
        It allows any object to be added.
        The compiler gives a warning.
        Can cause runtime errors (ClassCastException).
        */
        // List list = new LinkedList<>();

        /*This uses generic type List<Object>.
        Type-safe: the list can hold any Object, but at least the compiler knows the type.
        No raw-type warnings.
        Safer and recommended over raw type.*/

        /*List<Object> list = new LinkedList<>();
        list.add("Sifat");
        list.add("Arafat");
        list.add("Shakil");
        list.add(1);
        list.add(2);
        list.add(1.5);
        System.out.println(list);

        String s = (String) list.get(4); // ClassCastException, as index 4 element is integer*/

        /*Box<Integer> box = new Box<>();
        box.set(10);
        box.get();

        box.printItem(10);        // T = Integer
        box.printItem("Hello");   // T = String

        box.process(10);     // OK (Integer extends Number)
        box.process(5.5);    // OK (Double extends Number)
        // box.process("hi"); // ❌ Not allowed

        List list = new LinkedList<>(); // Generic list can accept any data type*/

        /*Box box = new Box();
        // box.setObject(new String("ABC"));
        box.setObject(9);

        Integer i = (Integer) box.getObject(); // explicit casting

        System.out.println(box.getObject());*/

        /*Box<Integer> box = new Box<>();
//        box.setObject(new String("ABC")); // hobe nah coz ami generics Integer use korci
        box.setObject(Integer.valueOf(10)); // hobe
        box.setObject(10); // hobe*/

        /*// Raw Type!
        // backward compatibility! Before java 5.0

        Box<Integer> newBox = new Box<>(); // old method pass kora jacche nah!

        Box box = newBox; // backward compatibility casting
        // New to Old conversion!
        // Old to New kora jabeynah!*/

        /*Integer[] num = {0, 1, 2, 3, 4};
        String[] words = {"Hello", "World"};
        Character[] chars = {'A', 'B', 'C'};

        arrayPrint(num);
        arrayPrint(words);
        arrayPrint(chars);*/
    }

    // Here T means any data type! 
    public static <T> void arrayPrint(T[] ele) { // we can pass any type of array!
        System.out.println();
        for(T item: ele) {
            System.out.println(item + " ");
        }
    }

    // Generic Box Class
    /*static class Box<T> {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }

        public <T> void printItem(T item) {
            System.out.println(item);
        }

        public <T extends Number> void process(T num) {
            System.out.println(num.doubleValue());
        }
    }*/
}
