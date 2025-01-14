package constructor;

public class Constructor2 {
	public int i;
	public static void main(String[] args) {
		Constructor2 cp = new Constructor2();   
		System.out.println(cp.i);
	}
		public Constructor2() {   //we can't define like static or non static constructors-->only public,private and protected is allowed
			i=20;
			System.out.println("hello");  //this is optional i.e u can do all the things as in methods in constructors also
	}
		public Constructor2(int a) {    //when i enter the value of a(in-->new constuctor2(222))then this will invoked and 222 is value/printed
			i=a;
			
		}

}
