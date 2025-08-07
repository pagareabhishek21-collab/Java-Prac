import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        System.out.println("Counting from 1 to " + number + " using for loop:");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Counting from " + number + " down to 1 using while loop:");
        int i = number;
        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();

        scanner.close();
    }
}

