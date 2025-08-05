import java.util.Scanner;

public class Arithmetic {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value for b: ");
		int b = sc.nextInt();
		
		//Add your code starting here.
		int sum = a + b;
		int diff = a - b;
		int multiplication = a * b;
		int quotient = a/b;
		int rem = a%b;

		System.out.println(sum);
		System.out.println(diff);
		System.out.println(multiplication);
		System.out.println(quotient);
		System.out.println(rem);
	}
	
}
