package javaAssigments2;

import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int number=sc.nextInt();
        int remainder=number%2;
        switch(remainder) {
        case 0:
        	System.out.println("the number is even");
        	break;
        case 1:
        	System.out.println("the number is odd");
        	sc.close();   }
	}

}
