package simplecalculator;
import java.util.Scanner;
public class Addition {
	 public static void main(String[] args) {
	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt for first number
	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();
	        
	        // Prompt for second number
	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
	        
	        // Calculate and display the sum
	        double sum = num1 + num2;
	        System.out.println("The sum is: " + sum);
	        
	        // Close the scanner
	        scanner.close();
	    }
}
