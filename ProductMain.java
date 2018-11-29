
public class ProductMain {
   public static void main(String args[]) {
	   //display a welcome message
	   Product p1 = new Product("123", "Abc", 35.00);
	   Product p2 = new Product("456", "XXXYYY", 315.00);
	   Product p3 = new Product("8910", "Hello", 25.00);
	   
	   p2.setPrice(32.22);
	   
	   System.out.println(p1.toString());
	   System.out.println(p1.getPriceFormatted());
//	   System.out.println("Product count: "+ p1.getCount());
	   
	   System.out.println(p2.toString());
	   System.out.println(p2.getPriceFormatted());
	   
	   System.out.println(p3.toString());
	   System.out.println(p3.getPriceFormatted());
	   
	   
   }
}
