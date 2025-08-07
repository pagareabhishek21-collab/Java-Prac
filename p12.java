class Person {
    String name = "Parent - Krish";

    Person() {
        System.out.println("Person (super) constructor called.");
    }

    void displayInfo() {
        System.out.println("Name from Person class: " + name);
    }
}

class Students extends Person {
    String name = "Child - Student";

    Students() {
        super(); // Call parent constructor
        System.out.println("Student constructor called.");
    }

    void display() {
        super.displayInfo(); // Call parent method
        System.out.println("Student's own name: " + name);
        System.out.println("Accessing parent name using super: " + super.name);
    }
}

final class College {
    final int collegeCode = 101; // Constant

    final void collegeInfo() {
        System.out.println("Final College Code: " + collegeCode);
    }
}

public class SuperFinalDemo {
    public static void main(String[] args) {
        System.out.println("=== super keyword demonstration ===");
        Students s = new Students();
        s.display();

        System.out.println("\n=== final keyword demonstration ===");
        College c = new College();
        c.collegeInfo();
    }
}
