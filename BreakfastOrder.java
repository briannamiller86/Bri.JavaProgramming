import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Breakfast Order Program
 * Demonstrates Boolean expressions and nested if statements
 * Author: Brianna Miller
 * Course: COP-2800-98672 Java Programming
 * Assignment: P2 - Boolean Expressions and Code Branching
 * Date: 2/16/2025
 * AI Statement: AI was not used in the completion of this assignment.
 */
public class BreakfastOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Print header information
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Name: Brianna Miller");
        System.out.println("Course: COP-2800-98672 Java Programming");
        System.out.println("Assignment: P2 - Boolean Expressions and Code Branching");
        System.out.println("Date and Time: " + dtf.format(now));
        System.out.println();

        // Collect breakfast order details
        boolean coffee = getYesOrNo(scanner, "Would you like coffee?");
        boolean cream = false, nonDairyCream = false, sugar = false, sugarSub = false;
        if (coffee) {
            cream = getYesOrNo(scanner, "Would you like cream in your coffee?");
            if (cream) {
                nonDairyCream = getYesOrNo(scanner, "Would you like non-dairy cream?");
            }
            sugar = getYesOrNo(scanner, "Would you like sugar in your coffee?");
            if (sugar) {
                sugarSub = getYesOrNo(scanner, "Would you like a sugar substitute?");
            }
        }

        boolean bacon = getYesOrNo(scanner, "Would you like bacon?");
        boolean canadianBacon = false, veganBacon = false;
        if (bacon) {
            canadianBacon = getYesOrNo(scanner, "Would you like Canadian bacon?");
            veganBacon = getYesOrNo(scanner, "Would you like vegan bacon?");
        }

        boolean eggs = getYesOrNo(scanner, "Would you like eggs?");
        String eggStyle = "";
        if (eggs) {
            System.out.println("How would you like your eggs? (scrambled/sunny-side-up/fried)");
            eggStyle = scanner.next().toLowerCase();
            if (eggStyle.equals("fried")) {
                System.out.println("Would you like them over easy, over medium, or over hard?");
                eggStyle += " " + scanner.next().toLowerCase();
            }
        }

        boolean toast = getYesOrNo(scanner, "Would you like toast?");
        boolean wheatToast = false;
        if (toast) {
            wheatToast = getYesOrNo(scanner, "Would you like wheat toast?");
        }

        // Determine if the breakfast is healthy
        boolean healthyBreakfast = (!coffee || (!cream && !sugar) || (nonDairyCream || sugarSub)) &&
                                   (!bacon || veganBacon) &&
                                   (!toast || wheatToast);
        
        // Print order summary
        System.out.println("\nYour breakfast order:");
        System.out.println("Coffee: " + (coffee ? "Yes" : "No"));
        if (coffee) {
            System.out.println("  Cream: " + (cream ? (nonDairyCream ? "Non-dairy" : "Regular") : "No"));
            System.out.println("  Sugar: " + (sugar ? (sugarSub ? "Sugar substitute" : "Regular sugar") : "No"));
        }
        System.out.println("Bacon: " + (bacon ? (veganBacon ? "Vegan" : (canadianBacon ? "Canadian" : "Strips")) : "No"));
        System.out.println("Eggs: " + (eggs ? eggStyle : "No"));
        System.out.println("Toast: " + (toast ? (wheatToast ? "Wheat" : "White") : "No"));

        // Print health recommendation
        if (healthyBreakfast) {
            System.out.println("\nThis is considered a healthy breakfast!");
        } else {
            System.out.println("\nConsider taking a walk afterwards!");
        }
    }

    /**
     * Helper method to get a Yes or No response from the user
     */
    private static boolean getYesOrNo(Scanner scanner, String question) {
        System.out.println(question + " (yes/no)");
        String response = scanner.next().toLowerCase();
        return response.equals("yes") || response.equals("y");
    }
}
