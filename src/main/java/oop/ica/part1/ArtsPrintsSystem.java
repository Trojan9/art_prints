/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.ica.part1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author OBATARE OBIRE - D3097126
 *         CONFIDENCE ANTWI - S3154679
 *         OLUWATIMILEHIN BANJO - C2249753
 * 
 */
public class ArtsPrintsSystem {

    public static void main(String[] args) {
        
        // Create instance of Scanner class for taking user input
        Scanner keyboard = new Scanner(System.in);

        // Display name and advertising phrase
        welcome();

        
        //declare local variables
        int option = -1;
        
        //start while loop
        while (option != 0) {
            
            // Display the menu
            menu();
            
            
            // Using a try catch block to handle any exceptions that might occur from non-integer inputs
            try {
                
                // listen to keyboard input
                option = keyboard.nextInt();
                
                //process choice
                switch (option) {
                    case 0 -> System.out.print("Thanks for using our services, see you next time!");
                    
                    case 1 ->view();
                    
                    case 2 ->buy();
                    
                    case 3 ->add();
                    
                    default -> System.out.println("Incorrect option, please try again!");
                    
                }//end of switch
                
            } 
            catch (InputMismatchException e) {
                //validation method
                //if value is not an integer, error is thrown
                System.err.println("Incorrect input, please enter a number from the menu options");
                
                //reset value to local variable
                option=-1;
                keyboard.nextLine();
            }
            
            
        }//end of while loop
        
    }//end of main
    
    
    static void menu(){
        // Display the menu
        System.out.println("\nMENU: ");
        System.out.println("\n 1. View \n 2. Buy \n 3. Add \n 0. Quit ");
    }//end of menu function
    
    static void welcome(){
        // Display name and advertising phrase
        System.out.println("ART PRINTS");
        System.out.println("Welcome to ART PRINTS, Where Walls Become Canvases: Art Prints for Every Space!");
      
    }//end of welcome function
    
    static void buy(){
        // Display choice
        System.out.println("Your selected option is:\nBUY");
    }//end of buy function
    
     static void view(){
        // Display choice
        System.out.println("Your selected option is:\nVIEW");
    }//end of view function
     
     static void add(){
        // Display choice
        System.out.println("Your selected option is:\nADD");
    }//end of add function
    
}
