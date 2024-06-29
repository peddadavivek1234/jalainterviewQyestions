package access_modifers;

class DefaultClass_02
{
    int a=10;
    int b=20;
    void display(){
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}

public class default_class_method {
	public static void main(String[] args){
		DefaultClass_02 obj=new DefaultClass_02();
	    obj.display();
	}
}
