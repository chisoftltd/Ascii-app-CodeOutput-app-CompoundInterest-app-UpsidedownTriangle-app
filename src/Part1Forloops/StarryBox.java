/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1Forloops;

import java.util.Scanner;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * (a)  First create a program that asks the user to enter an integer . 
 * Then use a single for-loop, to print out a line of  stars, as follows: 
   ************************* 
   *(b) Extend the program, asking the user for a second integer , and then use 
   * a for loop inside a for loop to print a rectangle of  stars wide, by  stars
   * deep, as follows
   * 
   * 
 */
public class StarryBox {

    private static int starX;
    private static int starY;

    public static void main(String[] args) {

        System.out.println("Enter a Number:");
        starX = new Scanner(System.in).nextInt();

        System.out.println("Enter another Number:");
        starY = new Scanner(System.in).nextInt();

        for (int i = 0; i < starY; i++) {
            for (int j = 0; j < starX; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
