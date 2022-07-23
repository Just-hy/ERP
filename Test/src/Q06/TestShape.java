package Q06;


public class TestShape {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[]{
				new Cirle(9),
				new Rect(5.,6.),
				new Square(7)
		};
		
		for(Shape i:shapes){
			System.out.println("the girth is :"+i.girth());
			System.out.println("the area is :"+i.area());
		}
		
		
	}
}
