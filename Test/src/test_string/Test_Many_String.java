package test_string;

public class Test_Many_String{
	
	public static void main(String[] args) {
		
		
		//String是一个不可变类
		//修改String会重新分配空间
		String aString = "123";
		aString = "456";
		//打印结果456
		System.out.println(aString);
		
		
		//StringBuffer 提供append()、insert()、toString()
		//reverse()、setCharAt()、setLength()等方法
		//通过synchronized实现线程安全
		
		StringBuffer buffer = new StringBuffer("123");
		buffer.append("456");
		//打印结果：123456，在内存空间中不重新开辟空间
		
		//StringBuilder与StringBuffer类似，但是效率高，没有线程安全
		
	}
}
