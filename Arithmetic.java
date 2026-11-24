import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int numberOne = sc.nextInt();
		System.out.print("Enter number 2: ");
		int numberTwo = sc.nextInt();

		int addition = numberOne + numberTwo;
		int subtraction = numberOne - numberTwo;
		int multiplication = numberOne * numberTwo;
		int division = numberOne / numberTwo;
		int remainder = numberOne % numberTwo;

		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);
		System.out.println("Remainder: " + remainder);
		
	}
	
}
