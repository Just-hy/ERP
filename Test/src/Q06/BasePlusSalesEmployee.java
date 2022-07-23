/**
 * 
 */
package Q06;

/**
 * @author huangyi
 *
 */
public class BasePlusSalesEmployee extends SalesEmployee {

	private final static int DEEP_SALARY = 200;

	/**
	 * @param name
	 * @param Month
	 */

	public BasePlusSalesEmployee(String name, int Month, int salecount) {
		super(name, Month, salecount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return DEEP_SALARY + super.getSalary(month);
	}
}
