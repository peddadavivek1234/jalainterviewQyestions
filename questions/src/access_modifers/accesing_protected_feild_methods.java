package access_modifers;


//Class with protected fields and method
class ProtectedClassFieldsMethod {
 // Protected field
 protected String name;

 // Protected method
 protected void protectedMethod() {
     System.out.println("This is a " + name);
 }
}

public class accesing_protected_feild_methods {
	public static void main(String[] args) {
        // Creating object of ProtectedClassFieldsMethod class.
        ProtectedClassFieldsMethod pc = new ProtectedClassFieldsMethod();
        // Accessing protected field
        pc.name = "Protected Method in Same Package";
        // Accessing protected method
        pc.protectedMethod();
    }
}
