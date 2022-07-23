package chongwu;

public class Dog extends Pet {

	private String stand;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, String varieties, int age, String stand) {
		super(name, varieties, age);
		this.stand = stand;
		// TODO Auto-generated constructor stub
	}

	public void setStand(String stand) {
		this.stand = stand;
	}

	public String getStand() {
		return stand;
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("the dog is barking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("the dog is eatting");
	}

	public void swimMing() {
		System.out.println("the dog is swimming");
	}
}
