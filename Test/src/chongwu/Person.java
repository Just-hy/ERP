package chongwu;

public class Person {
	
	public static void jude(Pet pet){
		pet.bark();
		pet.eat();
		if(pet instanceof Dog){
			((Dog) pet).swimMing();
		}
		if(pet instanceof Cat){
			((Cat)pet).catchMouse();
		}
	}
	
}
