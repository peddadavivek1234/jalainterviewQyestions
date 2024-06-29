package interfaces;


//Interface with public, static final fields
interface Jala_09 {
 int num1 = 11;         // public static final by default
 static final int num2 = 22;
 final int num3 = 33;
}

public class interface_private_protected implements Jala_09 {
	public static void main(String[] args) {
        // Directly access the interface fields
        System.out.println(Jala_09.num1); // Access using interface name
        System.out.println(Jala_09.num2);
        System.out.println(Jala_09.num3);

        // Alternatively, we can also access them through an instance of the implementing class
        interface_private_protected if9 = new interface_private_protected();
        System.out.println(if9.num1);
        System.out.println(if9.num2);
        System.out.println(if9.num3);
    }
}
