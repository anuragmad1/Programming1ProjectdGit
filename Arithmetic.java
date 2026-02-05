import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value for b: ");
		int b = sc.nextInt();
		
		//Add your code starting here.
		int addition = a + b;
		int subtraction = a - b; 
		int multiplication = a * b;
		double division = a / b;
		int remainder = a % b;

		System.out.print(addition);
		System.out.print(subtraction);
		System.out.print(multiplication);
		System.out.print(division);
		System.out.print(remainder);
		
	}
	
}
