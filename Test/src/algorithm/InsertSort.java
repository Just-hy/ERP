package algorithm;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] array = { 12, 1, 3, 46, 5, 0, -3, 12, 35, 16 };
		myinsertSort(array);
		System.out.println(Arrays.toString(array));
		insertSort(array);
		System.out.println(Arrays.toString(array));

	}

	// 插入排序
	public static void myinsertSort(int[] array) {
		int tag = 0;
		boolean tag1 = false;
		for (int i = 1; i < array.length; i++) {
			tag1 = false;
			int insertValue = array[i];
			for (int j = i - 1; j >= 0; j--) {
				if (insertValue < array[j]) {
					array[j + 1] = array[j];
					tag = j;
					tag1 = true;
				}
			}
			if (tag1) {
				array[tag] = insertValue;
			}
		}
	}

	public static void insertSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int insertValue = array[i];
			int j = i - 1;
			
			//从右向左比较元素的同时，进行元素复制
			for(;(j>=0)&&(insertValue<array[j]);j--){
				array[j + 1] = array[j];
			}
			
			//insertValue的值插入适当位置
			array[j+1]=insertValue;
		}
	}

}
