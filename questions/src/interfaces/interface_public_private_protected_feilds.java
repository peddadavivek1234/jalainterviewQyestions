package interfaces;

//Interface with public fields and methods
public interface Jala_10 {

 // public fields (implicitly public, static, and final)
 int num1 = 11;
 int num2 = 22;
 int num3 = 33;

 // public method
 void display();
}

public class interface_public_private_protected_feilds implements Jala_10 {
	@Override
    public void display() {
        System.out.println("Displaying the values of the interface fields:");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
    }

    public static void main(String[] args) {
    	interface_public_private_protected_feilds if9 = new interface_public_private_protected_feilds();
        if9.display();
    }
}
