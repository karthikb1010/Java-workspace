package shapes;

public class Square {
double side;

public Square(double s) {
	this.side=s;
}
public double squareArea() {
	double A=side*side;
	System.out.println("Area of square is:" +A);
	return(A);
}
}
