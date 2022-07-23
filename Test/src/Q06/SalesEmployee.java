/**
 * 
 */
package Q06;

/**
 * @author huangyi
 *
 */
public class SalesEmployee extends Employee {

	private final static double RATE = 0.2;

	private int salecount;

	/**
	 * @param name
	 * @param birthMoth
	 */
	public SalesEmployee(String name, int birthMoth, int salecount) {
		super(name, birthMoth);
		// TODO Auto-generated constructor stub
		this.salecount = salecount;
	}

	public int getSalecount() {
		return salecount;
	}

	public void setSalecount(int salecount) {
		this.salecount = salecount;
	}

	public static double getRate() {
		return RATE;
	}

	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		return salecount * RATE + super.getSalary(month);
	}

}
