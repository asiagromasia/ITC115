
public class TicketMain {
	public static void main(String[]args) {
	System.out.println("Ticket");
	Ticket t1 = new Ticket();
	t1.TicketNumber();
	t1.getPrice(12);
	t1.toString();
	System.out.println();
	
	System.out.println("Walkup Ticket");
	WalkupTicket t2 = new WalkupTicket();
	t2.TicketNumber();
	t2.getPrice(1);
	t2.toString();
	System.out.println();
	
	System.out.println("Advance Ticket");
	AdvanceTicket t3 = new AdvanceTicket();
	t3.TicketNumber();
	t3.getPrice(12);
	t3.Type();
	t3.toString();
	System.out.println();
	
	System.out.println("Student Advance Ticket");
	StudentsAdvanceTicket t4 = new StudentsAdvanceTicket();
	t4.TicketNumber();
	t4.Type();
	t4.getPrice(15);
	t4.toString();
	System.out.println();
	
	}	
	
}
