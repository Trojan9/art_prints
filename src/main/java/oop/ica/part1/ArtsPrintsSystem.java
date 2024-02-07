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
        Scanner keyboard = new Scanner(System.in);

        // display name and advertising phrase
        System.out.println("");
        System.out.println("Welcome to ART PRINTS, Where Walls Become Canvases: Art Prints for Every Space!");
        System.out.println("");

        // display the menu
        System.out.println("MENU: ");
        System.out.println("");
        System.out.println("1. View");
        System.out.println("2. Buy");
        System.out.println("3. Add");
        System.out.println("0. Quit");

        // listen to keyboard and perform task
        int option = -1;
        while (option != 0) {

            // Using a try catch block to handle any wrong inputs
            // error handling
            try {

                option = keyboard.nextInt();
                // algorithm
                switch (option) {
                    case 0 -> {
                        System.out.print("Thanks for using our services, see you next time!");
                    }
                    case 1 -> {
                        System.out.println("Your selected option is: ");
                        System.out.println("View");
                    }
                    case 2 -> {
                        System.out.println("Your selected option is: ");
                        System.out.println("Buy");
                    }
                    case 3 -> {
                        System.out.println("Your selected option is: ");
                        System.out.println("Add");
                    }

                    default -> {
                        System.out.println("Incorrect option, please try again!");
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Incorrect input, please enter a number from the menu options");
                keyboard.next();
            }

            // prints menu out if option is not to quit at the end of the task
            if (option != 0) {
                System.out.println("");
                System.out.println("MENU: ");
                System.out.println("");
                System.out.println("1. View");
                System.out.println("2. Buy");
                System.out.println("3. Add");
                System.out.println("0. Quit");
            }

        }

    }
}
