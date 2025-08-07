import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== 2D Array Demo ===");

        int[][] matrix = new int[2][2];
        System.out.println("Enter 4 elements for a 2x2 matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n=== String Function Demo ===");
        sc.nextLine(); // consume leftover newline
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("Original String: " + input);
        System.out.println("Length: " + input.length());
        System.out.println("Uppercase: " + input.toUpperCase());
        System.out.println("Lowercase: " + input.toLowerCase());

        if (input.length() >= 3) {
            System.out.println("Substring (0-3): " + input.substring(0, 3));
        }

        if (!input.isEmpty()) {
            System.out.println("First character: " + input.charAt(0));
        }

        System.out.println("Is string empty? " + input.isEmpty());
        sc.close();
    }
}
