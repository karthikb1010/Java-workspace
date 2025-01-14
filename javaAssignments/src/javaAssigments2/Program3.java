package javaAssigments2;

import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the day name");
		String dayName= sc.next();
		switch(dayName) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("uff!its a weekday");
			break;
		case"saturday":
		case"sunday":
			System.out.println("yayy! its a weekend");
			break;
			default:
			System.err.println("ITS INVALID");
			break;
		}
	}

}
