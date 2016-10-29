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
 * Design and implement a program to meet the following requirements:  
 * Using a for-statement inside another for-statement to control repetition,  
 * the program should:  
 * • prompt the user to enter 1 positive integer value  
 * • input this to local variable .  
 * • The program should display a "triangle" of asterisks   
 * high and  wide as shown in the diagram to the right: 
 * 
 */

public class Triangle {

    private static int starY;

    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        starY = new Scanner(System.in).nextInt();

        for (int i = 0; i <= starY; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
