import java.util.Scanner;

 public class SecureDivision {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Prompt user for input
         System.out.print("Enter the first positive integer (1-100): ");
         int num1 = getValidInput(scanner);
         
         System.out.print("Enter the second positive integer (1-100): ");
         int num2 = getValidInput(scanner);
         
         // Perform division if input is valid
         if (num2 != 0) {
             double result = (double) num1 / num2;
             System.out.println("Result: " + result);
         } else {
             System.out.println("Error: Division by zero is not allowed.");
         }
     }
     
     // Method to validate input
     private static int getValidInput(Scanner scanner) {
         int num;
         while (true) {
             if (scanner.hasNextInt()) {
                 num = scanner.nextInt();
                 if (num >= 1 && num <= 100) {
                     return num;
                 } else {
                     System.out.print("Invalid input. Enter a number between 1 and 100: ");
                 }
             } else {
                 System.out.print("Invalid input. Please enter a valid integer: ");
                 scanner.next(); // Clear invalid input
             }
         }
     }
 }
 