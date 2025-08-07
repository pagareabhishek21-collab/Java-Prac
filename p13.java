import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter numerator: ");
            int num = sc.nextInt();

            System.out.println("Enter denominator: ");
            int den = sc.nextInt();

            if (num < 0 || den < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }

            int result = num / den; // May throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException ae) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (IllegalArgumentException ie) {
            System.out.println("Custom Error: " + ie.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e);
        } finally {
            System.out.println("This block always executes (finally block).");
            sc.close();
        }
        System.out.println("Program continues...");
    }
}
