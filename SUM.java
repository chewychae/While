/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SUM;

import java.util.Scanner;

/**
 *
 * @author Fedrequilan_CPE
 */
public class SUM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = input.nextInt();
        int sum = 0;
        for (int i = 1; i < a + 1; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                sum = sum + i;
            } else if (i % 5 == 0) {
                System.out.println(i);
                sum = sum + i;

            }
            
        } System.out.println(sum);


        // TODO code application logic here
    }

}
