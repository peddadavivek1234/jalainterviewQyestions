package methodOverloading;

public class method_overloading {
    // 01. Two methods with the same name but different number of parameters of same type
    void method1(int num1) {
        System.out.println("Method 1 with one parameter: " + num1);
    }

    void method1(int num1, int num2) {
        System.out.println("Method 1 with two parameters: " + num1 + ", " + num2);
    }

    public static void main(String[] args) {
        method_overloading mo = new method_overloading();

        // 01. Calling method1 with different number of parameters of same type
        mo.method1(10);
        mo.method1(10, 20);
    }
}
