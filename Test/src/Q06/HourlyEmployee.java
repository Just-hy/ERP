/**
 * 
 */
package Q06;

/**
 * @author huangyi
 *
 */
public class HourlyEmployee extends Employee {

	private final static int HOUR_SALARY = 1;
	private int workhour;
	/**
	 * @param name
	 * @param birthMoth
	 */
	public HourlyEmployee(String name, int birthMoth,int workhour) {
		super(name, birthMoth);
		// TODO Auto-generated constructor stub
		this.workhour=workhour;
	}
	
	@Override
	public double getSalary(int month) {
		// TODO Auto-generated method stub
		double salary = 0;
		if(workhour>160){
			salary = (workhour-160)*1.5+160*HOUR_SALARY;
		}else{
			salary = workhour * HOUR_SALARY;
		}
		return salary+super.getSalary(month);
	}
	
	

}
