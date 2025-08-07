public class Student {
    String name;
    int age;
    double marks;

    void displayDetails() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.marks = 87.5;

        System.out.println("Student 1 Details:");
        s1.displayDetails();

        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 22;
        s2.marks = 91.0;

        System.out.println("\nStudent 2 Details:");
        s2.displayDetails();
    }
}
