package generics_method;

public class GenericMethodExample {
    public <T> void arrayPrint(T[] val) {
        for(T item: val) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
