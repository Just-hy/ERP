package xunhuan;

public class TestBreak {
	public static void main(String[] args) {
	      int [] numbers = {10, 20, 30, 40, 50};
	 
	      for(int x : numbers ) {
	         // x ���� 30 ʱ����ѭ��
	         if( x == 30 ) {
	            break;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }
	   }
}
