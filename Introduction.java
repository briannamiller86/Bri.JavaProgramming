/*
Brianna Miller
COP-2800-98672 Java Programming
1/19/2025
The code below executes simple print statements responding to "D1 - First Java program for this course."
No AI was used to complete this assignment.

Revision Log:
First revision (2/16/2025): Added functionality to prompt the user for their details (Name, Major, Plans after graduation, Fun Fact) and display their introduction.
*/

import java.util.Scanner;

public class Introduction {
    public static void main(String[] args) {
        // Introduction of myself
        System.out.println("Hello, my name is Brianna Miller (Bri for short).");
        System.out.println("I am majoring in Computer Programming and Analysis.");   
        System.out.println("This is my third year dual enrolled at HCC.");
        System.out.println("Oddly enough, my ultimate career goal is to become an ECU tuner for cars.");     
        System.out.println("Fun fact: I am currently building my 2009 BMW e92 M3.");
        
        // Creating Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Collecting user details
        System.out.println("\nNow, I would love to learn about you!");
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();
        
        System.out.print("Enter your major: ");
        String userMajor = scanner.nextLine();
        
        System.out.print("What are your plans after graduation? ");
        String userPlans = scanner.nextLine();
        
        System.out.print("Share a fun fact about yourself: ");
        String userFunFact = scanner.nextLine();
        
        // Displaying user introduction
        System.out.println("\nNice to meet you, " + userName + "!");
        System.out.println("You are majoring in " + userMajor + ".");
        System.out.println("Your plans after graduation: " + userPlans);
        System.out.println("Fun fact about you: " + userFunFact);
        
        // Closing Scanner
        scanner.close();
    }
}
