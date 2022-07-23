package qfstu;

class MyClass{
	int value;
}


public class TestRef {
	public static void main(String args[]){
		int a=10;
		int b=a;
		b++;
		System.out.println(a);
		MyClass mc1=new MyClass();
		mc1.value = 10;
		MyClass mc2 =mc1;
		mc2.value++;
		System.out.println(mc1.value);
		System.out.println("----------------------------");
		System.out.println(mc1);
		System.out.println(mc2);
		mc1=null;
		System.out.println("----------------------------");
		System.out.println(mc1);
		System.out.println(mc2);
		

	}
}
