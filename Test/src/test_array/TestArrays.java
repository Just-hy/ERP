package test_array;

import java.awt.geom.AffineTransform;
import java.util.Arrays;
import java.util.Random;

import org.omg.CORBA.SystemException;

public class TestArrays {

	public TestArrays() {
		// TODO Auto-generated constructor stub
	}

	public static void test1() {
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

		// copyOfRange(int[] original, int from, int to)
		// 第一个参数表示源数组
		// 第二个参数表示开始位置(取得到)
		// 第三个参数表示结束位置(取不到)
		int[] b = Arrays.copyOfRange(a, 0, 3);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println("\n--------------------------------");
	}

	public static void test2() {
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		String content = Arrays.toString(a);
		System.out.println(content);
	}

	public static void test3() {
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		System.out.println("排序之前:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("排序之后:");
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------------------------");
	}

	public static void test4() {

		// 使用binarySearch进行查找之前，必须使用sort进行排序

		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		System.out.println("数字82出现的位置:" + Arrays.binarySearch(a, 82));

		System.out.println("--------------------------------------");
	}

	public static void test5() {
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		int b[] = new int[] { 18, 62, 68, 82, 65, 8 };

		System.out.println(Arrays.equals(a, b));

		System.out.println("--------------------------------------");

	}

	public static void test6() {
		int a[] = new int[10];

		Arrays.fill(a, 5);

		System.out.println(Arrays.toString(a));
		System.out.println("--------------------------------------");
	}

	// 二维数组排序
	public static void test7() {
		int[][] a = new int[5][8];
		int[] b = new int[40];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(100);// 0-100
			}
			/*
			 * 先把二维数组使用System.arraycopy进行数组复制到一个一维数组 然后使用sort进行排序 最后再复制回到二维数组。
			 * arraycopy(Object src, int srcPos, Object dest, int destPos, intlength) 
			 * src：lengthByte 源数组 
			 * srcPos：源数组中起始copy的position 
			 * dest：目的地 数组
			 * destPos：目的地数组中放置的位置 
			 * position length：需要copy的长度
			 *
			 * 
			 */

			System.arraycopy(a[i], 0, b, a[i].length * i, a[i].length);
		}

		System.out.println("原来的数组:");
		for (int i = 0; i < a.length; i++) {
			// 这一整段都是用来验证是否正确的
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		// 排序
		Arrays.sort(b);
		// 复制回到二维数组
		for (int i = 0; i < a.length; i++) {
			System.arraycopy(b, a[i].length * i, a[i], 0, a[i].length);
		}

		// for (int[]i:a) {
		// for (int j:i) {
		// System.out.print(j+" ");
		// }
		// System.out.println();
		// }
		//
		// //空一行方便打印效果
		// System.out.println("\n");

		System.out.println("排序后的数组:");
		for (int i = 0; i < a.length; i++) {
			// 这一整段都是用来验证是否正确的
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// Arrays.copyOfRange()
		test1();
		// Arrays.toString()
		test2();
		// Arrays.sort()
		test3();
		// Arrays.binarySearch()
		test4();
		// Arrays.equals()
		test5();
		// Arrays.fill()
		test6();
		// 练习：二维数组排序
		test7();
	}

}
