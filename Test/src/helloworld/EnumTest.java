package helloworld;

public class EnumTest {
	public static void main(String[] args){
		FreshJuice juice = new FreshJuice();
		juice.size = FreshJuice.FreshJuiceSize.medium;
		System.out.print(juice.size);
		
	}
}

class FreshJuice {
	enum FreshJuiceSize{ small , medium , large }
	FreshJuiceSize size;
}