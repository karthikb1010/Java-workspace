package constructor;


/*constructor is a block of codes similar to the method .It is called when an instance(object)of the class is created*/
/*whenever object is creating inside class i.e some space/memory is allocating to variables(the operation by which the memory allocates is we do from constructors*/ 
/*default construcor is always public bcz it is created by java and java doesnt know what value u use them.
 by simple definiton-->when creating objects if u want to define data of variables in class then we use or call constructors,unlike we call methods after creating objects
 //constructor helps in memory management.
 * Rules in constructor-->1)constructor name is always class name
                          2)constuctor dont have a concept of return type(i.e no use of keyword void)
		                  3)default constructor is always public*/
		                  

public class ConstructorPractice {
	public static void main(String[] args) {
		ConstructorPractice cp = new ConstructorPractice(); // upto this line we not called constructor but inside java when we write this statement by default it creates constructor called default constructor or implicit constructor (u can check by pressing Constructorpractice() andfn and f3 */
		
}
    public ConstructorPractice() {         //this is explicit constructor ie we make this,even we dont make ,by default java does the same thing called default constructor(we cant see )
}                                         //explicit is of 2 types--parameterized and  parameter-less constructor(so by this default constructor is always parameter-less constructor)
    public ConstructorPractice(int a) {  //this is parameterised constructor
}
}//by the time we add constructor,java didn't add constructor so if we add parameterised constructor,it is our responsibility to also add explicit non parameterised constructor 


