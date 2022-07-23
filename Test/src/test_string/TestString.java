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

		// ����
		Arrays.sort(array);

		// ƴ��
		// ����������󳤶�,������Ĭ��16,�����Լ�����
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
		
		//������   2 2 4 5 6 8 9
		
		String string3 = null;
		string3 += 5;
		System.out.println(string3);
		//������   null5
		
		

	}
}
