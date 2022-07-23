package duotai;

public class Example {

	public static void main(String[] args) {

		Animal[] example = new Animal[3];

		// 第一个样例创建为Animal；

		example[0] = new Animal();

		// 第二个样例创建为Bird；

		example[1] = new Bird();

		// 第三个样例创建为Cat；

		example[2] = new Cat();

		for (int i = 0; i < 3; i++) {

			example[i].speak();

		}

		System.out.println("-------------------------");

		for (int i = 0; i < 3; i++) {

			showValue(example[i]);

		}
	}

	public static void showValue(Animal x) {

		x.speak();

	}
	
	
	
}

class Animal {

	String x;

	Animal() {

		x = "animal";

	}

	void speak() {

		System.out.println("I am an animal");

	}

}

class Bird extends Animal {

	String x;

	Bird() {

		x = "Bird";

	}

	void speak() {

		System.out.println("I am a Bird");

	}

}

class Cat extends Animal {

	String x;

	Cat() {

		x = "Cat";

	}

	void speak() {

		System.out.println("I am a Cat");

	}

	

}
