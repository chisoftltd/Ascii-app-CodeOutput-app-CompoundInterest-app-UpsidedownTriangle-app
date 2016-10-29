package Part1Forloops;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Implement a Java program that prompts the user to enter any integer value n.
 * The program should then display the n times multiplication table for all 
 * numbers 1 up to 12.
 * 
 * For example, if the user enters a value 6 for n, the program should print:
 * 1 x 6 = 6
 * 2 x 6 = 12
 * ...
 * 12 x 6 = 72
 * 
 */
public class TimesTable {

    private static int number;

    public static void main(String[] args) {
        System.out.println("Enter a number:");
        number = new Scanner(System.in).nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(i + " * " + number + " = " + i * number);
        }
    }

}
