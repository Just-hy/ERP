package helloworld;

public class TestOperator {

	public static void main(String[] args) {
		m2();
	}

	public static void m1() {
		int a = 10;
		int b = 20;
		int c = 25;
		int d = 25;
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("b / a = " + (b / a));
		System.out.println("b % a = " + (b % a));
		System.out.println("c % a = " + (c % a));
		System.out.println("a++   = " + (a++));
		System.out.println("a--   = " + (a--));
		// 查看 d++ 与 ++d 的不同
		System.out.println("d++   = " + (d++));
		System.out.println("++d   = " + (++d));
	}
	
	public static void m2(){
		  int a = 10;
	        int b = 20;
	        int c = 0;
	        c = a + b;
	        System.out.println("c = a + b = " + c );
	        c += a ;
	        System.out.println("c += a  = " + c );
	        c -= a ;
	        System.out.println("c -= a = " + c );
	        c *= a ;
	        System.out.println("c *= a = " + c );
	        a = 10;
	        c = 15;
	        c /= a ;
	        System.out.println("c /= a = " + c );
	        a = 10;
	        c = 15;
	        c %= a ;
	        System.out.println("c %= a  = " + c );
	        c <<= 2 ;
	        System.out.println("c <<= 2 = " + c );
	        c >>= 2 ;
	        System.out.println("c >>= 2 = " + c );
	        c >>= 2 ;
	        System.out.println("c >>= 2 = " + c );
	        c &= a ;
	        System.out.println("c &= a  = " + c );
	        c ^= a ;
	        System.out.println("c ^= a   = " + c );
	        c |= a ;
	        System.out.println("c |= a   = " + c );
	}
	
}