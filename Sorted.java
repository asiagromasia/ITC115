public class Sorted {

	public static void main(String[] args) {
		
		
    double[] list1 = { 2.9, 4.0, 4.1, 11.2, 3.7 };
    double[] list2 = { 1.0, 3.3, 20.2 };
		System.out.println(isSorted(list1));
		System.out.println(isSorted(list2));
			
		}
	

		public static boolean isSorted(double[] list) {
		
			for(int i = 1; i < list.length; i++) {
		
				if(list[i] < list[i - 1])	{	
					return false;
		
				}
			}
			
			return true; 
	
		
	}

}
