
public class Magazine extends LibraryItem {
	public Magazine(String Type, int Number, String Title, Boolean reserve, String checkIn, String checkOut,
			double payFines) {
		super(Type, Number, Title, reserve, checkIn, checkOut, payFines);
		// TODO Auto-generated constructor stub
	}
	public void payFines() {
		System.out.println("Your fine is $5.");
		
	}
	public String Type() {
		Type = "Magazine: ";
		return Type;
		
	}
	public void checkOut() {
		System.out.println("You have 10 days to return this item.");
		
	}
}
