/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @Author Alex
 */
public class JavaApplication1 {

    //---------------------------Main Method-------------------------//
    public static void main(String[] args) 
    {
        printMessage();
        DifferentDataTypes();
        ConstantsandVariables.MyMethod();
        ConstantsandVariables.SecondMethod();
    }
    //----------------------------------------------------------------------//
    
    //----------------------Generate Method-------------------------------//
    private static void printMessage()
    {
         System.out.println("Hello World");
    
    } 
    //-----------------------------------------------------------------//
    
    //-------------Method to demonstrate different data types-----------------//
    private static void DifferentDataTypes()
    {
        //Declaring varibales of different data types
        int age = 30;
        double price = 19.99;
        boolean isStudent = true;
        char grade = 'A';
        String name = "Wild Banana";
        
        System.out.println(name + "is " + age + " years old, is a student " + 
                isStudent + ", and has a grade: " + grade);
    }
    //-----------------------------------------------------------------------//
}

//--------------------------Wow im done--------------------------------------//