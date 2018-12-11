
public class LibraryMain {
	public static void main(String[]args) {
		System.out.println("Library Item");
		LibraryItem i1 = new LibraryItem();
		i1.Type();
		i1.Title();
		i1.Number();
		i1.checkIn();
		i1.checkOut();
		i1.payFines();
		i1.reserve();
		i1.toString();
		

}
