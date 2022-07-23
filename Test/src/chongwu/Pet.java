package chongwu;

public class Pet {
	private String name;
	private String varieties;
	private int age;
	
	public Pet() {}

	public Pet(String name, String varieties, int age) {
		this.name = name;
		this.varieties = varieties;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVarieties() {
		return varieties;
	}

	public void setVarieties(String varieties) {
		this.varieties = varieties;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void bark(){
		System.out.println("the pet is barking");
	}
	
	public void eat(){
		System.out.println("the pet is eatting");
	}

	
}
