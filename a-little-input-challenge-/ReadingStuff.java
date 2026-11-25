import java.util.Scanner;

public class ReadingStuff {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Float: ");
		Double userFloat = scanner.nextDouble();

		scanner.nextLine();
		
		System.out.println("Enter String:" );
		String userString = scanner.nextLine();

		System.out.println(userFloat + userString);

		
	}
	
}
