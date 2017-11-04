/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for variables a, b, and c
	a => 5 + 1 = 6 correct
	b => 10 - 1 = 9 correct
	c =>  9 + 5 = 14 incorrect -   int c = int b = 10 +  variable a = 6 = 10 + 6 = 16
 
 	After testing the statements in the main method, indicate above if your predictions were correct.
*/

public class ReAssignment {

	public static void main(String[] args) {
		int a = 5; 
		int b = 10; 
		int c = b;
		a = a + 1; 
		b = b - 1; 
		c = c + a;
		b = c % a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	
		// TODO Auto-generated method stub

	}

}
