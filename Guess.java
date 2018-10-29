import java.util.Scanner;

public class Guess {
	

public static void main(String[] args) {

		introduction();
		makeGuess();
		}
		public static void makeGuess() {
			System.out.print("What is your guess? ");
			Scanner console = new Scanner(System.in);
		    int guess = console.nextInt();
			int totalguess = 1;

	
		
       while (guess <= 47){
			System.out.print("guess = " + guess);
			guess = console.nextInt();
			totalguess++;
			//adding the exceptions via another method
			guessWrong(guess);
				
		}
        
		System.out.print("total guesses = " + totalguess);
		
		}

		
private static void guessWrong(int guess) {
//adds guess requirements and quits counting, it shows the last guess though
	if (guess > 50){
		System.out.println("Wrong number entered!");
		System.out.println("Number needs to be 50 or under!");
	
		} else if (guess < 1)
		{
			System.out.println("Wrong number entered!");
			System.out.println("Number needs to be above 1!");
		}
	}

private static void introduction() {
	
	System.out.println("Please guess a number between 1 and 50 until you guess the right one.");
}
}
