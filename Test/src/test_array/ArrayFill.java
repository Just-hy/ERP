package test_array;

import java.util.Arrays;
import java.util.Collections;

public class ArrayFill {
	public static void main(String[] args) {
		int[] arr = new int[5];
		/**
		 * 1、Arrays.fill() 填充数组
		 */
		Arrays.fill(arr, 4);
		/**
		 * 2、Arrays.toString() 将数组中的内容全部打印出来
		 */
		String str = Arrays.toString(arr);
		System.out.println(str);

		int[] arr2 = new int[5];
		/**
		 * 3、Arrays.fill() 将指定数组中的第2位开始，到第4位（不包括）赋值为8
		 */
		Arrays.fill(arr2, 2, 4, 8);
		String str2 = Arrays.toString(arr2);
		System.out.println(str2);

		/**
		 * 1、数字排序
		 */
		int[] arr1 = new int[] { 12, 3, 8, 0, -4 };
		System.out.println("未排序前数组内容：");
		String s1 = Arrays.toString(arr1);
		System.out.println(s1);
		Arrays.sort(arr1);
		// System.out.println(arr1.toString());//打印的是数组地址
		String str1 = Arrays.toString(arr1);
		System.out.println("排序后数组内容：");
		System.out.println(str1);
		System.out.println("-----------");

		/**
		 * 2、字符串排序，先大写，后小写
		 */
		String[] str11 = new String[] { "a", "b", "B", "A", "3", "S" };
		Arrays.sort(str11);
		String str21 = Arrays.toString(str11);
		System.out.println(str21);

		/**
		 * 3、严格按照字母表进行排序，忽略大小写
		 */
		Arrays.sort(str11, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(str11));

		/**
		 * 4、反向排序
		 */
		Arrays.sort(str11, Collections.reverseOrder());
		System.out.println(Arrays.toString(str11));

		/**
		 * 4、比较 Arrays重写了equals方法，比较的是里边的元素是否相等
		 */
		int[] arr3 = new int[] { 1, 2, 3 };
		int[] arr4 = new int[] { 1, 2, 3 };
		System.out.println(Arrays.equals(arr3, arr4));
		System.out.println(arr4.equals(arr3));

	}

	public static void m() {
		/**
		 * 截取数组 Arrays.copeOf() Arrays.copeOfRange()
		 */
		int[] arr = { 10, 20, 30, 40, 50 };
		/**
		 * 1、截取arr数组的3个元素赋值给arr1
		 */
		int[] arr2 = Arrays.copyOf(arr, 3);
		String str = Arrays.toString(arr2);
		System.out.println(str);
		/**
		 * 2、从2开始截取到第6位，不包括6，缺失的用0填充
		 */
		int[] arr3 = Arrays.copyOfRange(arr, 2, 6);
		String str3 = Arrays.toString(arr3);
		System.out.println(str3);
		
		int i =Arrays.binarySearch(arr,50);
        System.out.println("数组arr中50这个数的下标为："+i);

	}

}
