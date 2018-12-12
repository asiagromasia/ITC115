
public class AdvanceTicket extends Ticket {
	
	double Price;
	public String Type() {
		//System.out.println(" " + Type());
		String Type = "Advance Ticket";
		return Type;
	}
	public double getPrice(int days) {
		
		if (days < 10) { 
			Price = 40;
			System.out.println(" Your Price is $" + Price);
			return Price;
		}
		else Price = 30;
		System.out.println("your ticket price is: $" + Price);
		return Price;
	}
	public String toString(){
		String Item = "You are about to purchase: ";
		System.out.println(" ");
		System.out.println(" "+ Item + Type() +", ticket number: "+ TicketNumber()+ ", price: $" + Price);
		return Item;
}
	
}
