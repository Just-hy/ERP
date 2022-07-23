package qfstu;

public class Dog {
	String name;
	int age;
	boolean sexual;
	
	public Dog(){
		
	}
	
	public Dog(String name,int age,boolean sexual){
		this.name=name;
		this.age=age;
		this.sexual=sexual;
	}
	
	public void play(){
		System.out.println(name+"play");
	}
	
	public void play(int n){
		System.out.println(name+"play"+n+"minutes");
	}
	
}
