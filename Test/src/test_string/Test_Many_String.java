package test_string;

public class Test_Many_String{
	
	public static void main(String[] args) {
		
		
		//String��һ�����ɱ���
		//�޸�String�����·���ռ�
		String aString = "123";
		aString = "456";
		//��ӡ���456
		System.out.println(aString);
		
		
		//StringBuffer �ṩappend()��insert()��toString()
		//reverse()��setCharAt()��setLength()�ȷ���
		//ͨ��synchronizedʵ���̰߳�ȫ
		
		StringBuffer buffer = new StringBuffer("123");
		buffer.append("456");
		//��ӡ�����123456�����ڴ�ռ��в����¿��ٿռ�
		
		//StringBuilder��StringBuffer���ƣ�����Ч�ʸߣ�û���̰߳�ȫ
		
	}
}
