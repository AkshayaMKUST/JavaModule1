package oopsday2.shape;

public class Shape implements ShapeIface {

	
	private double length;
	private double breadth;
	
	public Shape( double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public void calculate() {
		
		double area=length*breadth;
		System.out.println("Area of the rectangle = "+area);
		
	}
}
