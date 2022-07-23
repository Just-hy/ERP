package test_string;

import java.util.Arrays;

public class TestString {
	public static void main(String[] args) {
		String string = "9 2 4 6 8 5 2";

		String arr[] = string.split(" ");

		// String arr[] ----------> int array[]
		int array[] = new int[arr.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(arr[i]);
		}

		// 排序
		Arrays.sort(array);

		// 拼接
		// 定义对象的最大长度,不定义默认16,并会自己扩容
		//new StringBuilder(20)
		StringBuilder sBuilder = new StringBuilder();
		
		
		for (int i = 0; i < array.length; i++) {
			if (i == array.length - 1) {
				sBuilder.append(array[i]);
			} else {
				sBuilder.append(array[i]).append(" ");
			}
		}

		String string2 = sBuilder.toString();
		System.out.println(string2);
		
		//输出结果   2 2 4 5 6 8 9
		
		String string3 = null;
		string3 += 5;
		System.out.println(string3);
		//输出结果   null5
		
		

	}
}
