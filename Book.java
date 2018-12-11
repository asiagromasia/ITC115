
public class Book extends LibraryItem {

	
	public Book(String Type, int Number, String Title, Boolean reserve, String checkIn, String checkOut,
			double payFines) {
		super(Type, Number, Title, reserve, checkIn, checkOut, payFines);
		
	}
	
	public void payFines() {
		System.out.println("Your fine is $5.");
		
	}
	public String Type() {
		Type = "Book: ";
		return Type;
		
	}
	public void checkOut() {
		System.out.println("You have 60 days to return this item.");
		
	}

}
