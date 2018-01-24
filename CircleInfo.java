
public class CircleInfo {
	private double radius;
	final private double PI = 3.14159;
	
	public CircleInfo(double radius) {
		radius = this.radius;
	}
	
	public CircleInfo() {
		radius = 0.0;
	}
	
	public void setRadius() {
		
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = PI * radius * radius;
		return area;
	}
	
	public double getDiameter() {
		double diameter = radius * 2;
		return diameter;
	}
	
	public double getCircumference() {
		double circumference = 2 * PI * radius;
		return circumference;
	}
	
}
