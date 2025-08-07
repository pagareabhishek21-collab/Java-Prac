public class Calculator { 
 int a, b; 
 Calculator() { 
 a = 0; 
 b = 0; 
 } 
 Calculator(int x) { 
 a = x; 
 b = 0; 
 } 
 Calculator(int x, int y) { 
 a = x; 
 b = y; 
 } 
 int add(int x, int y) { 
 return x + y; 
 } 
 int add(int x, int y, int z) { 
 return x + y + z; 
 } 
 double add(double x, double y) { 
 return x + y; 
 } 
 void displayValues() { 
 System.out.println("a = " + a + ", b = " + b); 
 } 
 public staƟc void main(String[] args) {
 // Constructor overloading 
 Calculator c1 = new Calculator(); 
 Calculator c2 = new Calculator(10); 
 Calculator c3 = new Calculator(5, 15);
 System.out.println("Constructor Overloading:");
 c1.displayValues();
 c2.displayValues();
 c3.displayValues();
 Calculator calc = new Calculator();
 System.out.println("\nMethod Overloading:");
 System.out.println("add(int, int): " + calc.add(5, 10));
 System.out.println("add(int, int, int): " + calc.add(5, 10, 15));
 System.out.println("add(double, double): " + calc.add(5.5, 3.3));
 }
}