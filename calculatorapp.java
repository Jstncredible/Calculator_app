
import java.util.Scanner;
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Select an operation (1/2/3/4/5): ");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
            
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero");
                        continue; // Continue to the next iteration
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
                    continue; // Continue to the next iteration
            }
            
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
}