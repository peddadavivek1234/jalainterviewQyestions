package access_modifers;

//Class with private fields and method
public class PrivateFieldsMethods {
 // Private fields
 private String name = "Sharan";
 private int age = 21;

 // Private method
 private void pvtMethod() {
     System.out.println("My Name is " + name + " and my age is " + age);
 }

 // Main method
 public static void main(String[] args) {
     PrivateFieldsMethods obj = new PrivateFieldsMethods();
     // Printing the fields in the main method
     System.out.println("Age: " + obj.age);
     System.out.println("Name: " + obj.name);
     // Calling the private method in the main method
     obj.pvtMethod();
 }
}

public class private_feild_methods extends PrivateFieldsMethods {
	public void accessPrivateMembers() {
        System.out.println("Cannot access private fields or methods from the subclass");
    }

    public static void main(String[] args) {
    	private_feild_methods subObj = new private_feild_methods();
        subObj.accessPrivateMembers();
    }
}
