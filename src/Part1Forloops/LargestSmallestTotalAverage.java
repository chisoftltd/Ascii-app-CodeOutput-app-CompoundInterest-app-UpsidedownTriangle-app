/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1Forloops;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * After the sum and average are being successfully calculated, enhance the 
 * program so that it tracks the maximum and minimum values too. 
 * Before the loop, add two extra variables: 
 * max      to store the maximum number that has been entered  
 * min      to store the minimum number that has been entered
 * then Inside the for-loop, add code that will max   
 * 
 * •    test whether the input is larger than the previous largest number, 
 *      if it is set    max equal to the input (to make it the new max) 
 * •    test whether the input is smaller than the previous smallest number, 
 *      if it is   set min equal to the input (to make it the new min)
 *      
 * After the loop, the program should display the largest value, the smallest 
 * value, the total and the average for the numbers entered by the user. 
 */

public class LargestSmallestTotalAverage {

    private static int num;
    private static int total;
    private static int count;
    private static double average;
    private static StringBuilder number = new StringBuilder();
    private static int max;
    private static int min;

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter number : "));
            total = total + num;

            if (i == 0) {
                max = num;
                min = num;
            }
            count = count + 1;
            average = total / count;
            number.append(num).append(",     ");
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        JOptionPane.showMessageDialog(null, number + "\nLargest value : " + max + "  "
                + " Smallest value : " + min + "\nTotal : " + total + " "
                + "Average : " + average);
    }
}
