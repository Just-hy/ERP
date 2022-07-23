package Q06;

public class Rect extends Shape {

	private double lenth;

	private double wide;

	public Rect(Double lenth, Double wide) {
		super();
		this.lenth = lenth;
		this.wide = wide;
	}

	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return lenth * wide;
	}

	@Override
	protected double girth() {
		// TODO Auto-generated method stub
		return 2 * (lenth + wide);
	}

}
