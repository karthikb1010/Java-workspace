package javaAssignments1;

import java.util.*;
public class Program3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the day");
  String dayName=sc.next();
  if(dayName.equals("monday")||
		  dayName.equals("tuesday")||
		  dayName.equals("wednesday")||
		  dayName.equals("thursday")||
		  dayName.equals("friday"))
	  System.out.println("uff! its a weekday");
  else if(dayName.equals("saturday")||
		  dayName.equals("sunday"))
	  System.out.println("yayy! its a weekend");
  sc.close();
}
}
