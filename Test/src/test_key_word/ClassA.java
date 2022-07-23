package test_key_word;

public class ClassA {
	static String a = "aString";

	String b = "bString";

	
	static {
		System.out.println("a:"+a);
		System.out.println("static block");
	}

	{
		System.out.println("b:"+b);
		System.out.println("dynamic block");
	}

	public static void showA() {
		System.out.println("static method");
	}

	public void showB() {
		System.out.println("dynamic method");
	}

	public ClassA() {
		System.out.println("construct ClassA");
	}
	
	private int method(){
		return 0;
	}

}
