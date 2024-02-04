/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package oop.ica.part1;

import java.util.Scanner;

/**
 *
 * @author oluwatimilehinbanjo
 */
public class ArtsPrintsSystem {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("");
        System.out.println("Welcome to ART PRINTS,Where Walls Become Canvases: Art Prints for Every Space!");
        System.out.println("");
        System.out.println("MENU: ");
        int option=-1;
        System.out.println("");
        System.out.println("1. View");
        System.out.println("2. Buy");
        System.out.println("3. Add");
        System.out.println("0. Quit");
        
        while(option !=0){
            option= keyboard.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("");
                    System.out.println("View");
                }
                case 2 -> {
                    System.out.println("");
                     System.out.println("Buy");
                }
                case 3 -> {
                    System.out.println("");
                     System.out.println("Add");
                }
                default -> {
                }
            }
            
            if(option!=0){
                System.out.println("");
                System.out.println("1. View");
                System.out.println("2. Buy");
                System.out.println("3. Add");
                System.out.println("0. Quit");
            }
            
        }
    }
}
