package Q07;

public class MyClass {

	private static int count;

	public MyClass() {
		// TODO Auto-generated constructor stub
		count++;
	}

	public static void showCount() {
		System.out.println(count);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new MyClass();
			MyClass.showCount();
		}
	}

}
