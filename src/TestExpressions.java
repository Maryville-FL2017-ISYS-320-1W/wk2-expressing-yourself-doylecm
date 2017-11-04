/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*
 	Your predicted values for the expressions
	1. 8 correct
	2. 7 incorrect - multiply and divide hold the same level of precedence, as opposed to Order of Operations
	3. 3 incorrect - same reason as above
	4. 4 correct
	5. 2 correct
	6. 11 correct
	7. "2 + 2" + 7 incorrect - writes 2 + 2, followed by 3, then 4.
	8. 7 + " 2 + 2" incorrect - adds 3 + 4, then writes sum, followed by 2 + 2
 
 	After testing the expressions in the main method, indicate above if your predictions were correct.
*/

public class TestExpressions {

	public static void main(String[] args) {
		System.out.println("2 + 2" + 3 + 4);
	}

}
