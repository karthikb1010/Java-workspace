package shapes;

public class Triangle {
	double base;
	double height;

	public Triangle(double b,double h) {
		this.base=b;
		this.height=h;
	}
	public double triangleArea() {
		double B=0.5*base*height;
		System.out.println("Area of triangle:" +B);
		return(B);
	}
}
