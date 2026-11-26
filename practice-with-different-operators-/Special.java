import java.util.Scanner;

public class Special {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();

		if((userInput % 3 == 0 && userInput >= 53 )|| (userInput % 2 == 1 && userInput < 12)){
			System.out.println("THis number is special");
		}

		else{
			System.out.println("This number is not speical");
		}
			

			
	}
}
