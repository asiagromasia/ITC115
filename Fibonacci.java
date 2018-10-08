
public class Fibonacci {

	public static void main(String[] args) {
		// write a for loop that computes and prints 12 fibonacci nrs
		//xn = xn-1 + xn-2
		// Fib Nr:list starts with 1 1 and each next is a sum of two nrs before it
		int x = 1;
		int y = 1; 
		int z;
		for (int i = 0; i < 12; i++)  {
			
			System.out.print(x + " ");
			z = x + y;
			x = y;
			y = z;
			
		}
		
	}
	 
}
