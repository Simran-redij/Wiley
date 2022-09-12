
public class Circle {
	
	final double pi = 3.142;
	double radius;
	double area;
	
	Circle(double radius){
		this.radius = radius;
	}
	
	public double calculateArea() {
		double area;
		area = pi * radius * radius;
		return area;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(2);
		double ans = c1.calculateArea();
		System.out.println("Area = "+ans);
	}

}
