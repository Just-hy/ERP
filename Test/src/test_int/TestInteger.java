package test_int;

import javax.swing.plaf.synth.SynthStyle;

public class TestInteger {
	
	
	public static void main(String[] args) {
		Integer i1 = Integer.valueOf(100);
		
		//String ---------->int
		int i2 = Integer.valueOf("100");
		
		System.out.println(i2);
		
		//String   + ����
		int num =100;
		String st = ""+num;
		System.out.println(st);
		
		
		String s1 = "100";
		//String ---------->int
		int i3= Integer.parseInt(s1);
		System.out.println(i3);
		
		//int  ---------->String
		String s2 = String.valueOf(num);
		System.out.println(s2);
		
		int a= 0b1100100;
		System.out.println(a);
		
		//�˽���0   16����  0x��0X
		
		//����ת����ʽ
		System.out.println(Integer.toBinaryString(555));
		
		
	}
}
