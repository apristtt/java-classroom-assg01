/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assg01;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Assg01_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1; int num2;
        
        System.out.print("Num 1 : ");
        num1 = sc.nextInt();
        System.out.println("input a : " + num1);
        
        System.out.print("Num 2 : ");
        num2 = sc.nextInt();
        System.out.println("input b : " + num2);
        
        System.out.println("Swap a : " + num2 + " Swap b : " + num1);
    }
    
}
