package java_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Intermediate Operations
        // filter:

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> evens = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList(); // list akare rakhtece!

        System.out.println(evens);

        List<String> var = List.of("sifat", "hasan", "imrul", "sara", "carl", "rifat");

        List<String> res = var.stream()
                .filter(n -> n.length() < 5)
                .toList();

        System.out.println(res);

        // map:

        List<String> names = List.of("imrul", "hasan", "sifat");

        List<String> upper = names.stream()
//                .map(String::toUpperCase) // For every element, call toUpperCase().
                .map(s -> s.toUpperCase()) // For every element, call toUpperCase().
                .toList(); //It converts the stream back into a List.

        System.out.println(upper);

        // flatMap:

        List<List<Integer>> lst = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(7, 8, 9)
        );

        List<Integer> flattened = lst.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flattened);

        List<String> lines = List.of("My name is ", "Sifat");

        List<String> flat = lines.stream()
//                .flatMap(lines::stream) // nested list er khetre kaz kortoh
                .flatMap(n -> Arrays.stream(n.split(" ")))
                .toList();

        /*lines.stream()
                .flatMap(n  -> Arrays.stream(n.split(" ")))
                .forEach(System.out::println);*/

        // Not Recommended
        /*lines.stream()
                .map(s  -> Arrays.stream(s.split(" ")))
                .forEach(subStr -> subStr.forEach(s -> lines.add(s)));
*/
        // distinct

        List<Integer> values = List.of(1, 2, 3, 2, 4, 5, 4, 6);

        List<Integer> disValues = values.stream()
                .distinct()
                .toList();

        System.out.println(disValues);


        // Help me understand terminal operations like: filter, map, flatmap, distinct, intermediate naki terminal

        // Important Terminal operations:

        // collect()
        List<Integer> lstt = List.of(1, 2, 3, 4, 5);

        List<Integer> ress = lstt.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // forEach()
        lstt.stream()
                .forEach(n -> System.out.print(n + ", "));

        // anyMatch()

        System.out.println(
                lstt.stream()
                        .anyMatch(n -> n % 2 == 0)
        );

        // allMatch()

        System.out.println(
                lstt.stream()
                        .allMatch(n -> n % 2 == 0)
        );

        // noneMatch()
        System.out.println(
                lstt.stream()
                        .noneMatch(n -> n > 10)
        );

        // count()

        System.out.println(
                lstt.stream()
                        .filter(n -> n % 2 == 0)
                        .count()
        );

        // findAny()

        System.out.println(lstt.stream().findAny().get());

        // reduce()

        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b); // sum of all elements in the list!
        System.out.println(sum);

        int max = nums.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> Math.max(a, b));

        System.out.println(max);

        List<String> namess = List.of("Sifat", "Imrul", "Hasan");

        String combined = namess.stream()
                .reduce("", (a, b) -> a + b + " ");

        System.out.println(combined.trim());  // Sifat Imrul Hasan

        /*// instead of using function we can use predicate!
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println(isEven.test(4)); // .test predicate er ekta method

        // for two parameters
        Comparator<Integer> tComparator = (n1, n2) -> {
          if(n2 == 0) {
              return -1;
          }
          return n1 / n2;
        };*/

        /*List<String> items = new ArrayList<String>();

        items.add("one");
        items.add("two");
        items.add("three");

        Stream<String> stream = items.stream();

        System.out.println(stream);*/

        /*List<Integer> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> evenSquares = lst.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .toList();

        System.out.println(evenSquares);*/
    }
}
