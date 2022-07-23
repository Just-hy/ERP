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
		// ��һ��������ʾԴ����
		// �ڶ���������ʾ��ʼλ��(ȡ�õ�)
		// ������������ʾ����λ��(ȡ����)
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
		System.out.println("����֮ǰ:");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("����֮��:");
		System.out.println(Arrays.toString(a));
		System.out.println("--------------------------------------");
	}

	public static void test4() {

		// ʹ��binarySearch���в���֮ǰ������ʹ��sort��������

		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		System.out.println("����82���ֵ�λ��:" + Arrays.binarySearch(a, 82));

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

	// ��ά��������
	public static void test7() {
		int[][] a = new int[5][8];
		int[] b = new int[40];
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = random.nextInt(100);// 0-100
			}
			/*
			 * �ȰѶ�ά����ʹ��System.arraycopy�������鸴�Ƶ�һ��һά���� Ȼ��ʹ��sort�������� ����ٸ��ƻص���ά���顣
			 * arraycopy(Object src, int srcPos, Object dest, int destPos, intlength) 
			 * src��lengthByte Դ���� 
			 * srcPos��Դ��������ʼcopy��position 
			 * dest��Ŀ�ĵ� ����
			 * destPos��Ŀ�ĵ������з��õ�λ�� 
			 * position length����Ҫcopy�ĳ���
			 *
			 * 
			 */

			System.arraycopy(a[i], 0, b, a[i].length * i, a[i].length);
		}

		System.out.println("ԭ��������:");
		for (int i = 0; i < a.length; i++) {
			// ��һ���ζ���������֤�Ƿ���ȷ��
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		// ����
		Arrays.sort(b);
		// ���ƻص���ά����
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
		// //��һ�з����ӡЧ��
		// System.out.println("\n");

		System.out.println("����������:");
		for (int i = 0; i < a.length; i++) {
			// ��һ���ζ���������֤�Ƿ���ȷ��
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
		// ��ϰ����ά��������
		test7();
	}

}
