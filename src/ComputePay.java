/*
  	ISYS 320
  	Name(s): Chris Doyle
  	Date: 11/3/2017
*/

public class ComputePay {
	public static void main(String[] args) {
		int a = 4 + 5 + 8 + 4; // hours worked
		double b = 8.75; // hourly pay
		System.out.println("My total hours worked:");
		System.out.println(a);
		
		System.out.println("My hourly salary:");
		System.out.println("$" + b);
		
		System.out.println("My total pay:");
		System.out.println("$" + a * b);
	}
}