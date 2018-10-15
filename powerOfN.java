
public class powerOfN {

	public static void main(String[] args) {
		
		printPowersOfN(2,7);
	    printPowersOfN(5,3);
	   
	}

	public static void printPowersOfN(int a, int count) {
		for(int i = 0; i <= count; i++) {
			double power = Math.pow(a, i);
		//casted type double to int with Math.round
			System.out.print(Math.round(power) + " ");
		   
		} 
		//separates both results
		System.out.println();
	}	
	
}
	
