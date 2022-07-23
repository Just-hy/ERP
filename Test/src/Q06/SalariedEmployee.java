/**
 * 
 */
package Q06;

/**
 * @author huangyi
 *
 */
public class SalariedEmployee extends Employee {

	private final static int MONTH_SALARY = 100;

	/**
	 * @param name
	 * @param month
	 */
	public SalariedEmployee(String name, int month) {
		super(name, month);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Q06.Employee#getSalary(int)
	 */
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return MONTH_SALARY + super.getSalary(month);
	}

}
