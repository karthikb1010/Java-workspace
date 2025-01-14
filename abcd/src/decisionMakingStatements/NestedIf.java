package decisionMakingStatements;
//nested if-->if within if......

public class NestedIf {
	public static void main(String[] args) {
		String examStatus="pass";
		if(examStatus =="pass") {
			System.out.println("wait for further round");
			String round1status="pass";
			if(round1status=="pass") {
				System.out.println("wait for 2nd round");
			String round2status="pass";
			if(round2status=="fail") {
				System.out.println("you are selected");}
	
		else {
			System.out.println("go to home");
		}
	}
			else {
				System.out.println("go to home");
			}}
			else {
				System.out.println("got to home");
			}
			
	}}
	


