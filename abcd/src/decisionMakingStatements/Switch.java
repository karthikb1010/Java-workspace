package decisionMakingStatements;


//if and if-else are conditional based statements but switch is like value based conditional statement and it will have multiple outcomes(unlike if ansd if else-2 outcomes),here also we verify condition but only one condition that is == condition
public class Switch {
	public static void main(String[] args) {
		int i=3;
		switch(i) {
		case 1:
			System.out.println("this is the firsst number");
			break;
		case 2:
			System.out.println("this is the second number");
			break;
		case 3:
			System.out.println("this is the third number");
			break;	
		default:
			System.err.println("invalid number");
			break;
		}
	}
}
/*we can also try
int i =3;  //u can give here 1 or 2 or 3 --for everything same answer
case1:
case2:
case3:
System.out.println("this is third number");
break;  */











