interface Printable {
    void print();
}

interface Showable {
    void show();
}

class Document implements Printable, Showable {
    public void print() {
        System.out.println("Printing the document...");
    }

    public void show() {
        System.out.println("Showing the document...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
