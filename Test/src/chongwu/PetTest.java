package chongwu;

import java.util.Scanner;

public class PetTest {
	public static void main(String[] args) {
		Pet pet = null;
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("please select");
			System.out.println("1.new a dog");
			System.out.println("2.new a cat");
			System.out.println("0.out");
			int op = scanner.nextInt();
			switch (op) {
			case 1:
				pet = new Dog();
				System.out.println("there is a new dog");
				break;
			case 2:
				pet = new Cat();
				System.out.println("there is a new cat");
				break;
			case 0:
				System.out.println("system out");
				return;
			default:
				System.out.println("select error");
				continue;
			}
			
			
			if(pet!=null){
				Person.jude(pet);
			}
			
			System.out.println("over--------------");
			scanner.close();
			break;
			
		}
	}
}
