
import java.util.Scanner;

public class season {

	public static void main(String[] args) {
		introduction();
		
		Scanner console = new Scanner(System.in);
		
		
	int b =	month(console);
	int a =	day(console);


	findSeason(a,b);
	
	
	System.out.print("Hope you like it!");
		
	  
	}
	
	
    public static String findSeason(int a, int b) {
  String result = "";
        System.out.println("This day is in: ");
		
		//String result;
		if ((b == 3 && a >= 16) || ((b == 6 && a <= 15)) || (b == 4) || (b == 5)) {
		    result = "Spring";
	//	    System.out.println(result);
		} else if 
			((b == 6 && a >= 16) || ((b == 9 && a <= 15)) || (b == 7) || (b == 8)) {
			result = "Summer";
	//		System.out.println(result);
			
		} else if 
			((b == 9 && a >= 16) || ((b == 12 && a <= 15)) || (b == 10) || (b == 11)) {
			result = "Fall";
	//		System.out.println(result);
		} else if
			((b == 12 && a >= 16) || ((b == 3 && a <= 15)) || (b == 1) || (b == 2)) {
			result = "Winter";
		} 
		System.out.println(result);
		
		return result ;
		
	 }


	public static void introduction() {
		System.out.print("This program will tell you in what season given day is" );;
		System.out.println();
	}
	
	public static int month(Scanner console) {
		System.out.println("Please enter the month number: ");
		int month = console.nextInt();
		if(month == 1) {
			System.out.println("btw. this is in January");
		} else if (month == 2) {
			System.out.println("btw. this is in February");
		} else if (month == 3) {
			System.out.println("btw. this is in March");
		} else if (month == 4) {
			System.out.println("btw. this is in April");
		} else if (month == 5) {
			System.out.println("btw. this is in May");
		} else if (month == 6) {
			System.out.println("btw. this is in June");
		} else if (month == 7) {
			System.out.println("btw. this is in July");
		} else if (month == 8) {
			System.out.println("btw. this is in August");
		} else if (month == 9) {
			System.out.println("btw. this is in September");
		} else if (month == 10) {
			System.out.println("btw. this is in October");
		} else if (month == 11) {
			System.out.println("btw. this is in November");
		} else if (month == 12) {
			System.out.println("btw. this is in December");
		} else {
			System.out.println("This is not the correct form!");

		}
		return month;
		}
	public static int day(Scanner console) {
		System.out.println("Please enter the day of the month: ");
		int day = console.nextInt();
		//int month = console.nextInt();
	return day;
	
	/*	
	 not enough time to incorporate following:
	 if ((day >=1 || day <=31) && ((month == 1) || (month == 3) || (month == 5) ||(month == 7) ||(month == 8) ||(month == 10) || (month == 12))) {
			return day;
		} else if ((day >=1 || day <= 30) && ((month == 2) || (month == 4) || (month == 6) ||(month == 9) ||(month == 11) ||(month == 10))) {
	
			return day;
		} //else {
	    //if (day < 1 || day >31 || (day = 31 && month == 2 || 4 || 6 || 9 || 11)) {
		//System.out.println("incorrect day of the month!");
	//	return ("incorrect day of the month");}
		else {
			System.out.println("incorrect day of the month!");
			return day;
		}
	
	*/
	}
}


