
public class DvdCd extends LibraryItem {
	
	public DvdCd(String Type, int Number, String Title, Boolean reserve, String checkIn, String checkOut,
			double payFines) {
		super(Type, Number, Title, reserve, checkIn, checkOut, payFines);
		
	}
	public void payFines() {
		System.out.println("Your fine is $10. ");
		
	}
	public String Type() {
		Type = "Dvd/Cd: ";
		return Type;
		
	}
	public void checkOut() {
		System.out.println("You have 50 days to return this item. ");
		
	}

}
