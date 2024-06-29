package abstract_class;


//Abstract class with abstract and non-abstract methods
abstract class Animal {
 // Abstract method (no implementation)
 abstract void sound();

 // Non-abstract method (implementation provided)
 void eat() {
     System.out.println("Animal is eating");
 }
}

public class abstract_nonabstract extends Animal {
	// Providing implementation for the abstract method
    @Override
    void sound() {
        System.out.println("Lion roars");
    }

    public static void main(String[] args) {
        // Creating an object of the subclass using the abstract class reference
        Animal A = new abstract_nonabstract();
        // Accessing the non-abstract method using the abstract class reference
        A.eat();

        // Creating an instance of the subclass
        abstract_nonabstract L = new abstract_nonabstract();
        // Calling the abstract method using the subclass instance
        L.sound();
        // Calling the non-abstract method using the subclass instance
        L.eat();
    }
}
