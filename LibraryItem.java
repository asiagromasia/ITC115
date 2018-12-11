//abstract class- default behavior
public abstract class LibraryItem {
	String Type;
	int Number;
	String Title;
	Boolean reserve;
	String checkIn;
	String checkOut;
	double payFines;
	
	// Constructor
	public LibraryItem(String Type, int Number, String Title, Boolean reserve, String checkIn, String checkOut, double payFines) {
		this.Number = Number;
		this.Title = Title;
		this.reserve = reserve;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		this.payFines = payFines;
		this.Type = Type;
		
		
	}
	String Type() {
		
		return null;
	}

	public void setNumber(int Number) {
		this.Number = Number;
	}
	public int getNumber() {
		return Number;
	}
	public void setTitle(String Title) {
		this.Title = Title;
	}
	public String getTitle() {
		return Title;
	}
	
	public void reserved() {
		System.out.println("This item was reserved");
		
	}
	public void checkIn() {
		System.out.println("You checked in on time.");
		
	}
	public void checkOut() {
		System.out.println("You have 20 days to return this item.");
		
	}
	public void payFines() {
		System.out.println("Your fine is 25$.");
		
	}
 public String toString() {
	 System.out.println("Type()+ getTitle() + getNumber() + checkIn()+ checkOut()+ payFines()");
	return null;
 }
}

