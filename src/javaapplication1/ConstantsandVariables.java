package javaapplication1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class ConstantsandVariables 
{
  static final double MIN_VALUE = 30;
  static String greeting = "Good day";     
  
//-------------------------My Method-------------------------------------//
    public static void MyMethod()
    {
        final int MAX_VALUE = 20;
        double result = 0;
        
        result = MAX_VALUE + 4;
        
        System.out.println("The result is " + result);
    }
    //------------------------------------------------------------------------//
    
    public static void SecondMethod()
    {
        System.out.println(greeting);
        System.out.println(MIN_VALUE);
    }        
}

//-----------------------------Finally Done----------------------------------//