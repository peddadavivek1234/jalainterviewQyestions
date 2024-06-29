package this_super;
//SuperClass
class Parent_06 {
 void method1() {
     System.out.println("Inside Parent method1");
 }

 void method2() {
     // Using this() to call method1
     this.method1();
 }
}

//SubClass
class Child_06 extends Parent_06 {
 void method3() {
     // Using super() to call parent method
     super.method2();
 }
}

public class this_super_methods {
	public static void main(String[] args) {
        Child_06 c = new Child_06();
        // Calling method3
        c.method3();
    }
}
