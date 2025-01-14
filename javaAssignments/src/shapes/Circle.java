package shapes;

public class Circle {
double radius;
double diameter;

public Circle(double radius) {
	this.radius=radius;
}
public double circleArea() {
	double abcd=Math.PI*radius*radius;
	System.out.println("Area of circle is:" +abcd);
	return(abcd);
}
}
