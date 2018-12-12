
public class StudentsAdvanceTicket extends Ticket {

	double Price;
    String Item;
    
	public String Type() {
		//System.out.println("Students Advance Ticket ");	
		String Type = "Students Advance Ticket";
		return Type;
	}
	
	public double getPrice(int days) {
	
		if (days < 10) { 
		 Price = 20;
		 System.out.println("your ticket price is: $" + Price);
		}
		else Price = 15;
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
