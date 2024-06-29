package constructors;

//Parent class with constructors
class ParentClass_01 {
 int rollNo;
 String name;
 String branch;

 // Default constructor
 ParentClass_01() {
     System.out.println("Parent class default constructor called");
 }

 // Argument constructor with int parameter
 ParentClass_01(int rollNo) {
     this.rollNo = rollNo;
     System.out.println("Parent class argument constructor called with roll number: " + this.rollNo);
 }

 // Argument constructor with String parameters
 ParentClass_01(String name, String branch) {
     this.name = name;
     this.branch = branch;
     System.out.println("Parent class argument constructor called with name: " + this.name + " and branch: " + this.branch);
 }
}

//Child class extending ParentClass_01
class ChildClass_02 extends ParentClass_01 {

 String clg;
 String city;

 // Default constructor calling ParentClass_01's default constructor using super()
 ChildClass_02() {
     super();
     System.out.println("Child class default constructor called");
 }

 // Argument constructor calling ParentClass_01's argument constructor with int parameter using super()
 ChildClass_02(int rollNo) {
     super(rollNo);
     System.out.println("Child class argument constructor called with roll number: " + rollNo);
 }

 // Argument constructor calling ParentClass_01's argument constructor with String parameters using super()
 ChildClass_02(String name, String branch, String clg, String city) {
     super(name, branch);
     this.clg = clg;
     this.city = city;
     System.out.println("Child class argument constructor called with name: " + name + ", branch: " + branch + ", college: " + clg + ", and city: " + city);
 }
}


public class call_super_from_child {
	public static void main(String[] args) {
		// Creating objects of ChildClass_02 and invoking constructors
        new ChildClass_02(); // Calls ChildClass_02 default constructor, which in turn calls ParentClass_01's default constructor
        System.out.println();

        new ChildClass_02(317); // Calls ChildClass_02 argument constructor with an integer, which calls ParentClass_01's argument constructor
        System.out.println();

        new ChildClass_02("Sharan", "CSE", "ICFAI", "Hyderabad"); // Calls ChildClass_02 argument constructor with strings, which calls ParentClass_01's argument constructor
	}
}
