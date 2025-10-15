package javaapplication1;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class Anotherone {
    public static final int MAX_VALUE =100;
    public static final String APPLICATION_NAME = "MyApp";
    
    public static void ConstantAndVariables(Scanner input) {
        System.out.println("\n=> Constants and Variables Section");

        System.out.println("Enter a starting value (integer): ");
        int currentValue = input.nextInt();
        input.nextLine(); // clear buffer

        System.out.println("Enter a message to display: ");
        String message = input.nextLine();

        currentValue += 25; // simulate some change

        System.out.println("\nCurrent Value (after update): " + currentValue);
        System.out.println("Message: " + message);
        System.out.println("Max value: " + MAX_VALUE);
        System.out.println("Application name: " + APPLICATION_NAME);
    }        
    
}
