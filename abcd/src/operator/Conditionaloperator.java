package operator;


//conditional operator--[&&(conditional AND),||(conditional OR)]
public class Conditionaloperator {
	public static void main(String[] args) {
		int i=20;
		int j=10;
		//System.out.println(i<j && i==j);
		System.out.println(i<j || i==j);
	}

}
/* &&                                          
true-true -->true
true-false-->false
false-true-->false
false-false-->false    */

/*for ||
true-true -->true
true-false-->true
false-true-->true
false-false-->false*/