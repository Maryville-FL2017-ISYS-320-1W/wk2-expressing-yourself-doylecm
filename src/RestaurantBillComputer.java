
public class RestaurantBillComputer {
	public static void main(String[] args) {
		
		double a = 20.00; // Bill total
		double b = .15; // 15% gratuity
		double c = .18; // 18% gratuity
		double d = .20; //20% gratuity
		
		System.out.println("Subtotal:$" + a);
		System.out.println("Gratuity:15%");
		System.out.println("   Total:$" + ((a * b) + a));
		System.out.println();
		
		System.out.println("Subtotal:$" + a);
		System.out.println("Gratuity:18%");
		System.out.println("   Total:$" + ((a * c) + a));
		System.out.println();
		
		System.out.println("Subtotal:$" + a);
		System.out.println("Gratuity:20%");
		System.out.println("   Total:$" + ((a * d) + a));
	}

	private static void line1() {
		// TODO Auto-generated method stub
		
	}
}
