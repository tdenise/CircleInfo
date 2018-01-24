import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input the radius of the circle: ");
		double rad1 = input.nextDouble();
		
		CircleInfo circle = new CircleInfo(rad1);
		
		displayCircleInfo(circle);
		
				
	}
	
	public static void displayCircleInfo(CircleInfo circle) {
		System.out.printf("The radius is: %.2d ", circle.getRadius);
	}
}
