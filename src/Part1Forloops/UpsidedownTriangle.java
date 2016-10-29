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
 */
public class UpsidedownTriangle {

    private static int star;

    public static void main(String[] args) {
        System.out.println("Enter a Number:");
        star = new Scanner(System.in).nextInt() * 2;
        int height = 0;

        for (int i = 0; i <= star; i++) {
            int j = 0;
            for (j = star/2; j > i; j--) {
                System.out.print("*");
            }
            for (j = 0; j < height; j++) {
                System.out.print(" ");
            }
            height += 1;
            System.out.println();
            for (j = 0; j < height; j++) {
                System.out.print(" ");
            }
            i++;
        }
    }
}
