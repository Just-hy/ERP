package Q06;

public class Employee {
	private String name;
	private int month;

	public Employee(String name, int month) {
		super();
		this.name = name;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public double getSalary(int month) {
		double superrise = 0;
		if (month == this.month) {
			superrise = 100;
		}
		return superrise;
	}

}
