// Demonstrating Single and Multilevel Inheritance in Java

// Base class (Parent)
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Single Inheritance: Dog inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance: Puppy inherits from Dog (which inherits from Animal)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Object of Animal (Base class)
        Animal a = new Animal();
        a.eat();

        System.out.println("\n--- Single Inheritance ---");
        // Object of Dog (Child class of Animal)
        Dog d = new Dog();
        d.eat();  // from Animal
        d.bark(); // from Dog

        System.out.println("\n--- Multilevel Inheritance ---");
        // Object of Puppy (Child of Dog, Grandchild of Animal)
        Puppy p = new Puppy();
        p.eat();  // from Animal
        p.bark(); // from Dog
        p.weep(); // from Puppy
    }
}
