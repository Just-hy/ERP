package Q06;


public class TestSalary {

	public TestSalary() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		int month = 5;
		Employee[] employees = new Employee[]{
				new  SalariedEmployee("zhangsan", 4),
				new HourlyEmployee("lisi", 2, 170),
				new SalesEmployee("wangwu",5, 2000),
				new BasePlusSalesEmployee("liu",4,2000)
		};
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].getName()+" in "+employees[i].getMonth()+
					" get "+employees[i].getSalary(month));
		}
	}

}
