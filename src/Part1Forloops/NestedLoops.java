/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1Forloops;

import java.util.Date;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 */
public class NestedLoops {

    private static int star;

    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("i = " + i);
            for (int j = 1; j <= 1000; j++) {
                System.out.println("j = " + j);
                for (int k = 1; k <= 1000; k++) {
                    System.out.println("k = " + k);
                    System.out.println(new Date());
                    System.out.println("Hello ");
                }
            }
        }
    }
}
