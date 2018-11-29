import java.text.NumberFormat;

//Design and Code a class for a generic product. 

//The product data should include a product code, description, price and product count. 

//In addition to the getter and setter method, the class should implement toString and also a formatted output of the price

public class Product {
	
//fields 
	private String code;
	private String description;
	private double price;
	private static int count = 0;
	
public Product(String code, String description, double price) {
	this.code = code;
	this.description = description;
	this.price = price;
	count++;
	
}
	
	public void setCode(String code) {
		this.code = code;
	}
	public String getCode() {
		return code;
	}
	
    public void setPrice(double price) {
	 this.price = price;
 }
		
	public double getPrice() { 	
    return price;
}
	
public String getPriceFormatted() {
	String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price) ;
	return formattedPrice;
}
	
	@Override
	public String toString() {
		return description ;
		
	}
	
	public static int getCount() {
		return count;
		
	}
}
