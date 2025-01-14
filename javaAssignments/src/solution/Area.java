package solution;

import java.util.Scanner;

import shapes.Circle;
import shapes.Square;
import shapes.Triangle;

public class Area {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side s:");
		double obj1=sc.nextDouble();
		System.out.println("Enter radius r:");
		double obj2=sc.nextDouble();
		System.out.println("Enter base b:");
		double obj3=sc.nextDouble();
		System.out.println("Enter height h:");
		double obj4=sc.nextDouble();
		
		Square obj11=new Square(obj1);
		obj11.squareArea();
		Circle obj22=new Circle(obj2);
		obj22.circleArea();
		Triangle obj33=new Triangle(obj3,obj4);
		obj33.triangleArea();
		
	}

}
