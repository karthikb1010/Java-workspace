package javaAssigments2;


import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first the number");
		int number1=sc.nextInt();
		System.out.println("enter the second number");
		int number2=sc.nextInt();
		System.out.println("enter the target operator");
		String operation=sc.next();
		
		int result=0;
		switch(operation) {
		case "+":
			result=number1 + number2;
			break;
		case "-":
			result=number1 - number2;
			break;
		case "*":
			result=number1 * number2;
			break;
		case "/":
			result=number1 / number2;
		case "%":
			result=number1 % number2;
			break;
		default:
			System.out.println("invalid");
			break;
		}
		System.out.println(result);
			
		}
		
		
	}


