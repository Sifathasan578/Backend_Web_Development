package evaluation.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> student_list = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter names: ");
        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            student_list.add(student);
        }

        System.out.println(student_list);

        System.out.print("Enter index of the student you want to get: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        System.out.println(student_list.get(index));

        System.out.println("Updated list: " + student_list);

        System.out.print("Enter student you want to remove: ");
        String removedStudent = scanner.nextLine();
        student_list.remove(removedStudent);

        System.out.println("Updated list: " + student_list);

        System.out.println("Using for each: ");
        for (String student: student_list) {
            System.out.print(student + " ");
        }

        Set<String> students_hashset = new HashSet<>(student_list);
        Set<String> students_linkedhashset = new LinkedHashSet<>(student_list);
        Set<String> students_treeset = new TreeSet<>(student_list);

        System.out.println("Hashset with no order: " + students_hashset);
        System.out.println("Linkedhashset with insertion order: " + students_linkedhashset);
        System.out.println("Treeset with sorted order: " + students_treeset);

        Map<String, Integer> students_hashmap = new HashMap<>();

        System.out.println("Enter marks for " + n + " students: ");
        for(int i = 0; i < n; i++) {
            int marks = scanner.nextInt();
            students_hashmap.put(student_list.get(i), marks);
        }

        // Using iterator:
        Iterator<String> itr = student_list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Hashmap after updating: " + students_hashmap);

        System.out.println("Updating marks");
        students_hashmap.put("nirob", 67);

        System.out.println("Hashmap after updating: " + students_hashmap);

        students_hashmap.remove("nirob");
        System.out.println("Hashmap after updating: " + students_hashmap);

        System.out.println(students_hashmap.get("arafat"));

        for(Map.Entry<String, Integer> entry: students_hashmap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        for (String key : students_hashmap.keySet()) {
            System.out.println(key);
        }

        for (Integer val : students_hashmap.values()) {
            System.out.println(val);
        }

        Map<String, Integer> students_linkedhashmap = new LinkedHashMap<>(students_hashmap);
        Map<String, Integer> students_treemap = new TreeMap<>(students_hashmap);

        System.out.println(students_hashmap);
        System.out.println(students_linkedhashmap);
        System.out.println(students_treemap);

        // addAll()

        List<String> lst = new ArrayList<>();
        lst.add("Sifat");
        lst.add("Arafat");
        lst.add("Shakil");

        List<String> lst2 = new ArrayList<>();
        lst2.add("Shoumo");
        lst2.add("Zarir");
        lst2.add("Saleh");

        lst.addAll(lst2);
        System.out.println(lst);
        System.out.println(lst2);

        student_list.stream()
                .filter(ele -> ele.startsWith("A"))
                .forEach(System.out::println);
    }
}
