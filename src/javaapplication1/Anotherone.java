package javaapplication1;

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
    
    public static void ConstantAndVariables()
    {
        //Variables
        int currentValue = 50;
        String message = "Hello World!";
        
        //Trying to change a constant at (will cause a compilation error)
        // MAX_VALUE = 200;
        
        //Changing a variable
        currentValue = 75;
        
        System.out.println("");
        System.out.println("=> Constants and Variables");
        System.out.println("Current Value: " + currentValue);
        System.out.println("Message: " + message);
        System.out.println("Max value: " + MAX_VALUE);
        System.out.println("Applicatio name: " + APPLICATION_NAME);
        
    }        
    
}
