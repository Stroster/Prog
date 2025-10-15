/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
/**
 *
 * @Author Alex
 */
public class JavaApplication1 {

    //---------------------------Main Method-------------------------//
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        printMessage();
        
        System.out.println("\nEnter your name: ");
        String name = input.nextInt();
        
        System.out.println("Enter your age: ");
        int age = input.nextInt;
                
        System.out.println("Enter your grade (A-F): ");  
        char grade = input.next().charAt(0);
        
        System.out.println("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();
        
        DifferentDataTypes(name, age, grade, isStudent, price);
        
        //Calling methods from other class
        ConstantandVariables.MyMethod(input);
        ConstantandVariables.SecondMethod();
        
        Anotherone.ConstantAndVariables(input);
        
        input.close();
    }
    //----------------------------------------------------------------------//
    
    
    private static void printMessage()
    {
         System.out.println("=== Welcome to my Java Application ===");
    
    } 
    //-----------------------------------------------------------------//
    
    private static void DifferentDataTypes(String name, int age, char grade, boolean isStudent, double price) {
        System.out.println("\n=> User Information:");
        System.out.println(name + " is " + age + " years old, is a student: " + isStudent +
                ", has a grade: " + grade + ", and a price value of: R" + price);
    }
    //-----------------------------------------------------------------------//
}

//--------------------------Wow im getting somewhere--------------------------//