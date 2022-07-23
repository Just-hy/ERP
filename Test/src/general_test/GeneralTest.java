package general_test;

public class GeneralTest {
	public static void main(String[] args) {
		byte b1 =127;
		b1+=1;  //隐式类型转换，但最终值不改变原有类型
		//b1 = b1 + 1 编译不通过，不能强制类型转换
		System.out.println(b1);
	}
}
