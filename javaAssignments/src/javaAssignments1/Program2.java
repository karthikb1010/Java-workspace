package javaAssignments1;


import java.util.*;

public class Program2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the marks");
int marks=sc.nextInt();
if(marks>=85) 
	System.out.println("you secured first class");
	else if(marks<35) 
		System.out.println("failed");
		else if(marks==35) 
			System.out.println("passed");
			else if(marks>35 && marks<70) 
				System.out.println("you secured third  class");
				else if(marks>=70 && marks<85)
					System.out.println("you secured second class");
					}}
	

