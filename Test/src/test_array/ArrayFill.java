package test_array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayFill {
	public static void main(String[] args) {
		int[] arr = new int[5];
		/**
		 * 1��Arrays.fill() �������
		 */
		Arrays.fill(arr, 4);
		/**
		 * 2��Arrays.toString() �������е�����ȫ����ӡ����
		 */
		String str = Arrays.toString(arr);
		System.out.println(str);

		int[] arr2 = new int[5];
		/**
		 * 3��Arrays.fill() ��ָ�������еĵ�2λ��ʼ������4λ������������ֵΪ8
		 */
		Arrays.fill(arr2, 2, 4, 8);
		String str2 = Arrays.toString(arr2);
		System.out.println(str2);

		/**
		 * 1����������
		 */
		int[] arr1 = new int[] { 12, 3, 8, 0, -4 };
		System.out.println("δ����ǰ�������ݣ�");
		String s1 = Arrays.toString(arr1);
		System.out.println(s1);
		Arrays.sort(arr1);
		// System.out.println(arr1.toString());//��ӡ���������ַ
		String str1 = Arrays.toString(arr1);
		System.out.println("������������ݣ�");
		System.out.println(str1);
		System.out.println("-----------");

		/**
		 * 2���ַ��������ȴ�д����Сд
		 */
		String[] str11 = new String[] { "a", "b", "B", "A", "3", "S" };
		Arrays.sort(str11);
		String str21 = Arrays.toString(str11);
		System.out.println(str21);

		/**
		 * 3���ϸ�����ĸ��������򣬺��Դ�Сд
		 */
		Arrays.sort(str11, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(str11));

		/**
		 * 4����������
		 */
		Arrays.sort(str11, Collections.reverseOrder());
		System.out.println(Arrays.toString(str11));

		/**
		 * 4���Ƚ� Arrays��д��equals�������Ƚϵ�����ߵ�Ԫ���Ƿ����
		 */
		int[] arr3 = new int[] { 1, 2, 3 };
		int[] arr4 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.equals(arr3, arr4));
		System.out.println(arr4.equals(arr3));

	}

	public static void m() {
		/**
		 * ��ȡ���� Arrays.copeOf() Arrays.copeOfRange()
		 */
		int[] arr = { 10, 20, 30, 40, 50 };
		/**
		 * 1����ȡarr�����3��Ԫ�ظ�ֵ��arr1
		 */
		int[] arr2 = Arrays.copyOf(arr, 3);
		String str = Arrays.toString(arr2);
		System.out.println(str);
		/**
		 * 2����2��ʼ��ȡ����6λ��������6��ȱʧ����0���
		 */
		int[] arr3 = Arrays.copyOfRange(arr, 2, 6);
		String str3 = Arrays.toString(arr3);
		System.out.println(str3);
		
		int i =Arrays.binarySearch(arr,50);
        System.out.println("����arr��50��������±�Ϊ��"+i);

	}

}
