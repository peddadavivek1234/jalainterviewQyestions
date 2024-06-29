package access_modifers;

// Class with public fields and method
class PublicClass_04 {
    // Public fields
    public String pName = "Public";

    // Public method
    public void publicMethod() {
        System.out.println("This is " + pName);
    }
}

public class public_class_feild_methids {
	public static void main(String[] args) {
        // Creating object of PublicClass_04.
        PublicClass_04 pub = new PublicClass_04();
        // Accessing public fields
        pub.pName = "Public Method in Same Package";
        // Accessing public method
        pub.publicMethod();
    }
}
