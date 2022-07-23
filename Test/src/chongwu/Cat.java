package chongwu;

public class Cat extends Pet{
	
	private String sleep;
	
	public Cat(){super();}
	
	public Cat(String name,String varieties,int age,String sleep){
		super(name, varieties, age);
		this.sleep = sleep;
	}
	
	public String getSleep(){
		return sleep;
	}
	
	public void setSleep(String sleep){
		this.sleep = sleep;
	}
	
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("the cat is barking");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("the cat is eatting");
	}
	
	public void catchMouse(){
		System.out.println("the mouse is catched by cat");
	}

}
