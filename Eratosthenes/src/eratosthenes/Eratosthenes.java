/*
 * Amro Abdelrhman
 * 26/02/2020
 * prime numbers
 */

package eratosthenes;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author amabd7808
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int n;
    double [] number = new double [1001]; 
        System.out.println("enter the number you want it stop at");
        n = input.nextInt();
        for(int i = 0; i <= n ; i++) {
         if (n % i == 0) {
            System.out.println(i);
         }
        }
    }
}
    
    

