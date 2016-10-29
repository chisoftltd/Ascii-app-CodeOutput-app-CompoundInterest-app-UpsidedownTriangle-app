/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1Forloops;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 */
public class Part2Tutorialstylequestionsonforloops {

    public static void main(String[] args) {
        int x = 0;
        for (int i = 1; i <= 10; i++) {
            x += i;
            System.out.print(x + " ");
        }

        System.out.println();
        int y = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                y += i;
            } else {
                y -= i;
            }
            System.out.print(y + " ");
        }
        System.out.println();

        int f = 1;
        for (int i = 1; i <= 5; i++) {
            f *= i;
            System.out.print(f + " ");
        }
        System.out.println();
    }
}
