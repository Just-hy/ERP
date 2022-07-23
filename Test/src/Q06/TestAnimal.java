package Q06;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TestAnimal {
	public static void main(String[] args) {
		Animal[] as =new Animal[]{
				new Dog("Pluto"),
				new Cat("Tom"),
				new Dog("Snoppy"),
				new Cat("Garfield")
		};
		
		Dog[] dogs = getAllDog(as);
		String string = Arrays.toString(dogs);
		System.out.println(string);
		for (int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].getName());
		}
	}
	
	public static Dog[] getAllDog(Animal[] as){
		Dog[] dogs = new Dog[10];
		int j = 0;
		for (int i = 0; i < as.length; i++) {
			if(as[i] instanceof Dog){
				dogs[j++]=(Dog)as[i];
			}
		}
		Dog[] realdogs = Arrays.copyOf(dogs, j);
		return realdogs;
	}
	
	
}

class Animal{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
class Dog extends Animal{
	Dog(String str){
		super.setName(str);
	}
}
class Cat extends Animal{
	Cat(String str){
		super.setName(str);
	}
}
