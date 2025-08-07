class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven...");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();  // Inherited from Vehicle
        myCar.drive();  // Defined in Car
    }
}
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // Inherited from Animal
        p.bark();  // Inherited from Dog
        p.weep();  // Defined in Puppy
    }
}
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Showing from A");
    }

    public void display() {
        System.out.println("Displaying from B");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
class Animals {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animals {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.sound();  // Inherited from Animals
        d.bark();   // Defined in Dogs

        Cat c = new Cat();
        c.sound();  // Inherited from Animals
        c.meow();   // Defined in Cat
    }
}
