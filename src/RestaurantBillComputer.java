
public class RestaurantBillComputer {
	public static void main(String[] args) {
		Gratuity1();
		Gratuity2();
		Gratuity3();
	}
	
	public static void line1() {
		System.out.println("Subtotal:$" + a);
	}
	
	public static void line2() {
		System.out.println();
	}
		
		static double a = 25.00; // Bill total
		static double b = .15; // 15% gratuity
		static double c = .18; // 18% gratuity
		static double d = .20; //20% gratuity
		
		public static void Gratuity1() {
		line1();
		System.out.println("Gratuity:15%");
		System.out.println("   Total:$" + ((a * b) + a));
		line2();
		}
		
		public static void Gratuity2( ) {
		line1();
		System.out.println("Gratuity:18%");
		System.out.println("   Total:$" + ((a * c) + a));
		line2();
		}
		
		public static void Gratuity3() {
		line1();
		System.out.println("Gratuity:20%");
		System.out.println("   Total:$" + ((a * d) + a));
		}
		
}
