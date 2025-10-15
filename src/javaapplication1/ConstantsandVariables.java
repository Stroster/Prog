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
public class ConstantsandVariables {
  static final double MIN_VALUE = 30;
  static String greeting = "Good day";     
  
    public static void MyMethod(Scanner input) {
        final int MAX_VALUE = 20;

        System.out.println("\nEnter a number to add to MAX_VALUE (20): ");
        double number = input.nextDouble();

        double result = MAX_VALUE + number;

        System.out.println("The result is " + result);
    }
    //------------------------------------------------------------------------//
    
    public static void SecondMethod() {
        System.out.println("\n=> Displaying Constants and Variables");
        System.out.println("Greeting: " + greeting);
        System.out.println("Minimum Value: " + MIN_VALUE);
    }        
}

//-----------------------------Almost there----------------------------------//