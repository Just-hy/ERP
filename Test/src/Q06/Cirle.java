package Q06;

public class Cirle extends Shape {
	private double banjin;

	public Cirle(double banjin) {
		super();
		this.banjin = banjin;
	}

	@Override
	protected double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(banjin, 2);
	}

	@Override
	protected double girth() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * banjin;
	}

}
