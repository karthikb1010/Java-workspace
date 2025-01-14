package operator;

import java.util.*;
public class Userinputfromconsole {
	public static void main(String[] args) {
 
		Scanner scanner=new Scanner(System.in);
		System.out.println("what is ur name?");
		String name=scanner.nextLine();
		System.out.printf("hey %s,how r u ?\n" ,name);
		String status=scanner.nextLine();
		System.out.println("what is u r age");
		int age=scanner.nextInt();
		System.out.println("thank you");
		scanner.close(); 
	}
}
