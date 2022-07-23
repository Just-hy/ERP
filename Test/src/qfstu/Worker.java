package qfstu;

public class Worker {
	String name;
	int age;
	double salary;
	Address addr;
	public Worker() {
	}

	public Worker(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public Worker(String name, int age, double salary,Address addr) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.addr = addr;
	}
	
	public void work(){
		System.out.println("Work");
	}
	
	public void work(int time){
		System.out.println("Work for "+time+"+hours");
	}
	
	public static void main(String[] args){
		Worker worker = new Worker("zhangsan",25,2500,new Address("北京市海淀区清华园1号", 100084));
		System.out.println(worker.name+"\n"+worker.age+"\n"+worker.salary+"\n"+worker.addr.addr+"\n"+worker.addr.addrnum);
		worker.work();
		worker.work(20);
		
//		Worker worker2 = new Worker("zhangsan",25,2500,new Address("北京市海淀区清华园1号", 100084));
//		worker2=null;
//		System.out.println(worker2.age);
	}
}
