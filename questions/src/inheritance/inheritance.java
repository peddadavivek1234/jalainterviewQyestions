package inheritance;

//Super class A
class A {
 int n = 11;

 void methodA1() {
     System.out.println("This is Class A Method 1");
 }

 void methodA2() {
     System.out.println("This is Class A Method 2");
 }

 void method3() {
     System.out.println("This is override method - Class A");
 }
}

//Subclass B of A
class B extends A {
 int n = 22;

 void methodB1() {
     System.out.println("This is Class B Method 1");
 }

 void methodB2() {
     System.out.println("This is Class B Method 2");
 }

 @Override
 void method3() {
     System.out.println("This is override method - Class B");
 }
}

//Subclass C of B
class C extends B {
 int n = 33;

 void methodC1() {
     System.out.println("This is Class C Method 1");
 }

 void methodC2() {
     System.out.println("This is Class C Method 2");
 }

 @Override
 void method3() {
     System.out.println("This is override method - Class C");
 }
}

public class inheritance {
	public static void main(String[] args) {
        // Creating and calling methods of class A
        A a = new A();
        a.methodA1();
        a.methodA2();
        a.method3();

        // Creating and calling methods of class B
        B b = new B();
        b.methodB1();
        b.methodB2();
        b.method3();

        // Creating and calling methods of class C
        C c = new C();
        c.methodC1();
        c.methodC2();
        c.method3();

        // Calling overridden method with superclass reference
        A orm;
        orm = new B();
        orm.method3();
        orm = new C();
        orm.method3();

        // Runtime Polymorphism with Data Members
        A rtp;
        rtp = new A();
        System.out.println(rtp.n); // Output: 11
        rtp = new B();
        System.out.println(rtp.n); // Output: 11
        rtp = new C();
        System.out.println(rtp.n); // Output: 11

        // Note: Method is overridden, not data members,
        // so runtime polymorphism can't be achieved by data members.
    }
}
