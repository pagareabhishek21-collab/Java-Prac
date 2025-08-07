import java.util.Vector;

public class p7 {
    public static void main(String[] args) {
        System.out.println("=== StringBuffer Demo ===");

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        System.out.println("\n=== Vector Demo ===");

        Vector<String> names = new Vector<>();
        names.add("Krish");
        names.add("Hem");
        names.add("Harsh");
        names.add("Jaimin");

        System.out.println("Vector elements: " + names);

        names.add(2, "NewName");
        System.out.println("After insertion at index 2: " + names);

        names.remove("Hem");
        System.out.println("After removing 'Hem': " + names);

        System.out.println("Size of vector: " + names.size());
        System.out.println("First element: " + names.firstElement());
        System.out.println("Last element: " + names.lastElement());

        // Check if a value exists
        System.out.println("Contains 'Krish'? " + names.contains("Krish"));
    }
}
