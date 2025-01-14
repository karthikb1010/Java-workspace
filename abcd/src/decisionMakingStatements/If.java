package decisionMakingStatements;
/*dMs allow u to make a decision based upon the result of a condition*/
//dMs are of 3 types--- if,if-else,switch
/*syntax for if-->
if(condition){
//statements(code)         //in if, we verify only positive outcome 
}   
*/

public class If {
public static void main(String[] args) {
	//int a=10;
	int a=-10;
	if(a<0) {
		System.out.println("the given no is a negative number");
	}
	if(a>0) {												//this if is just for reference
		System.out.println("the given no is a positive number");
	}
	}

}

