
public class Ticket {
	//fields
	private int TicketNumber;
	private double Price;
	private String Type;
	
	
//	private static int count = 0;
	
	//constructor- its the place where your object is born, should have the same name here Ticket
	// we need to use here temporary names for arguments so they can pass on the value, because we want to use them later on not just in this local function(fe.diameter)
/*	
	public Ticket(int TicketNumber, double Price, String Type, String Item) {
		this.TicketNumber = TicketNumber;
		this.Price = Price;
		this.Type = Type;
		this.Item = Item;
	
	}
	*/

	public String Type() {
		System.out.println("Ticket ");
		return Type;	
	}
	//here should be created loop counting numbers
	public int TicketNumber() {
	    int TicketNumber = 0;
		for (int i = 0; i < 2; i++) {
		      i ++;
		      TicketNumber = i;     
		System.out.println("your ticket number: " + i );}
		return TicketNumber;
	}
	
	public double getPrice(int days) {
		//Price = 5;
		System.out.println("your ticket price is $50");
		return Price;
	}
	
	

	public void setType(String type) {
		Type = type;
	}
	public String getType() {
		return Type;
	}
	
	/*public String toString(){
			String Item = "Type + TicketNumber + ', $' + Price";
			System.out.println(" " + Type + TicketNumber + Price);
			return Item;
	}
	
*/
	
}
