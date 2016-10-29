/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1Forloops;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * (a) Use a for-loop to implement a program that will print out the numbers 
 * from 1 to 100. 
 * 
 * (b) Once the program performs (a) correctly, adapt the program so that it 
 * asks the user to enter a number  and change the loop control condition so 
 * that the program prints out the numbers 1 to . 
 * 
 * (c) Once the program performs (b) correctly, adapt the program by creating 
 * a sum variable before the loop, and add statements inside the loop, so that 
 * the loop variable is added to sum  and the resulting sub-total is printed out
 * along with the loop variable.  
 * 
 * The first few lined of printout for (c) should look like:  
 * i    sum of 1 to i         
 * 1    1         
 * 2    3         
 * 3    6          
 * 4    10
 */

import javax.swing.JOptionPane;

public class Numbers {

    private static int userNumber;
    private static int sum;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer numbers = new StringBuffer();

        userNumber = Integer.parseInt(JOptionPane.showInputDialog("Choose a number : "));

        numbers.append("i              sum of 1 to ").append(userNumber);
        for (int i = 1; i <= userNumber; i++) {
            sum = sum + i;
            numbers.append("\n").append(i).append("              1").append(sum).append("\n");
        }

        JOptionPane.showMessageDialog(null, numbers);
    }

}
