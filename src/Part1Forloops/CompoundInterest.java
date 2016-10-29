/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1Forloops;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Implement a Java program that computes the effect of adding compound interest
 * earned on an initial investment of p pounds, earning r% interest each year. 
 * Assume that all interest is re-invested. The program should display the total
 * value of the investment at the end of each year from year 1 to year 25 after 
 * the initial investment has been made. 
 * • The program should prompt the user for the interest rate r and the initial 
 * investment value  p The variables  p  and r should be of type double 
 * • The program should use a for-loop to repeatedly calculate the effect of 
 * 25 years of interest. o Inside the loop, calculate the new value of the 
 * investment for that year, and display the year and the new value of the 
 * investment 
 * Note that the effect of compound interest is that at the end of each year 
 * the investment’s new value     of the investment becomes 
 */
public class CompoundInterest {

    private static double rate;
    private static double principle;
    private static double newPrinciple;
    private static StringBuilder yearInvestment = new StringBuilder();
    static DecimalFormat invFormat = new DecimalFormat("0.00");

    public static void main(String[] args) {
        rate = Double.parseDouble(JOptionPane.showInputDialog("ENTER INVESTMENT RATE: "));
        principle = Double.parseDouble(JOptionPane.showInputDialog("ENTER THE PRINCIPLE INVESTMENT:"));
        yearInvestment.append("Year                 Investment Value\n");
        for (int i = 1; i <= 25; i++) {
            newPrinciple = principle * (1 + (rate / 100));
            principle = newPrinciple;
            yearInvestment.append(i).append("                       ").append(invFormat.format(newPrinciple)).append(" \n");
        }
        JOptionPane.showMessageDialog(null, yearInvestment);
    }
}
