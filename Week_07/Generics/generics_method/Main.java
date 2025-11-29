package generics_method;

public class Main {
    public static void main(String[] args) {
        Integer[] nums = {0, 1, 2, 3, 4};
        String[] words = {"hello", "world"};
        Character[] chars = {'s', 'i', 'f', 'a', 't'};

        GenericMethodExample obj = new GenericMethodExample();
        obj.arrayPrint(nums); // integer array
        obj.arrayPrint(words); // string array
        obj.arrayPrint(chars); // character array

//        generics primitive types support kore nah!
    }
}
