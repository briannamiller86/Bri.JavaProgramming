/**
 * Author: Brianna Miller
 * Course: COP-2800-98672
 * Assignment: P1 - Egg Production
 */

 import java.time.LocalDateTime;
 import java.time.format.DateTimeFormatter;
 import java.util.Scanner;
 
 public class EggProduction {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Print program details
         System.out.println("Name: Brianna Miller");
         System.out.println("Course: COP-2800-98672");
         System.out.println("Assignment: P1 - Egg Production");
         System.out.println("Date and Time: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
         System.out.println();
         
         // Prompt user for input
         System.out.print("Enter the total number of chickens on the farm: ");
         int totalChickens = scanner.nextInt();
         
         System.out.print("Enter the number of roosters on the farm: ");
         int roosters = scanner.nextInt();
         
         System.out.print("Enter the percentage chance a chicken lays an egg (0.0 - 1.0): ");
         double eggChance = scanner.nextDouble();
         
         System.out.print("Enter the number of days: ");
         int days = scanner.nextInt();
         
         // Calculate estimated egg production
         int hens = totalChickens - roosters;
         double estimatedEggs = hens * eggChance * days;
         
         // Display result
         System.out.println("\nEstimated number of eggs produced: " + estimatedEggs);
         
         scanner.close();
     }
 }
 