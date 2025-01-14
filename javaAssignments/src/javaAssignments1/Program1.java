package javaAssignments1;


import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("plz enter the number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("the number is odd");
		}
		sc.close();
	}
}
