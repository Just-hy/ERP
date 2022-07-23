package tiaojian;

public class TestIfElseIfElse {
	public static void main(String[] args) {
		int x = 30;
		if (x == 10) {
			System.out.print("Value of X is 10");
		} else if (x == 20) {
			System.out.print("Value of X is 20");
		} else if (x == 30) {
			System.out.print("Value of X is 30");
		} else {
			System.out.print("’‚ « else ”Ôæ‰");
		}
		System.out.println();

		m();
	}

	public static void m() {
		int x = 30;
		int y = 10;

		if (x == 30) {
			if (y == 10) {
				System.out.print("X = 30 and Y = 10");
			}
		}
	}
}
