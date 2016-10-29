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
 * Background Info: Characters are stored by encoding the character as a 
 * numerical value which is then stored as bits in memory. One such encoding 
 * is the ASCII character code. 
 * 
 * If c  is a char variable and i  is an int variable then the statement   
 *      c = (char) i;  
 * will  (in most cases*) store the character whose ASCII code is i in the 
 * character c (if the code number corresponds to a printable character).  
 * (char)i does not match the standard ASCII table for every i since some 
 * values seem to represent other commonly used, but non-ASCII, characters.  
 */
public class Ascii {

    private static char c;
    private static StringBuilder ascii = new StringBuilder();
    private static StringBuilder ascii2 = new StringBuilder();
    private static StringBuilder ascii3 = new StringBuilder();
    private static StringBuilder ascii4 = new StringBuilder();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* 
        (a) Using a single for-loop, implement a Java program that will print 
            out the characters associated with ASCII values 65 to 90. 
        */
        
        for (int i = 65; i <= 90; i++) {
            c = (char)i;
            ascii.append(c).append("\n");
        }
        
         JOptionPane.showMessageDialog(null, ascii);
        
        
        /*
        (b) After the code for (a) add another single for-loop to print out the
            characters associated with ASCII  values 1 to 127
        */
            for (int i = 1; i <= 127; i++) {
            c = (char)i;
        if (i == 13)  ascii2.append(c = ' ');
            ascii2.append(c).append(",   ");
        }
        
         JOptionPane.showMessageDialog(null, ascii2);
        
        
        /*
        (c)  Make another copy of the loop from (c), and inside the copy add an 
        if statement to print a line break "\n" after every 10 characters.
        */
        
        for (int i = 1; i <= 127; i++) {
            c = (char) i;
            if (i % 10 == 0) {
                ascii3.append("\n\n");
            }
        if (i == 13)  ascii2.append(c = ' ');
            ascii3.append(c).append(" , ");
        }

        JOptionPane.showMessageDialog(null, ascii3);
        
 
        /*
        (d)  Using a for-loop within a for-loop, extend your program to print 
            out the characters associated with ASCII values 0 to 255 in 26 rows of 
            10 characters each. 
        */
        for (int i = 0; i <= 255; i++) {
            c = (char) i;
            if (i % 10 == 0) {
                ascii4.append("\n\n");
            }
            
            if (i == 13)  ascii2.append(c = ' ');
            ascii4.append(c).append(" , ");
        }

        JOptionPane.showMessageDialog(null, ascii4);
    }

}
